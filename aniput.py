import requests as rq

# Does not protect against sql injection, script tags nor double quotes.
def make_sql(title, info):
    return f'INSERT INTO shows(title,info) VALUES ("{title}","{info}");'

# https://anilist.github.io/ApiV2-GraphQL-Docs/
def do_search(title):
    return rq.post('https://graphql.anilist.co', json = {'variables':{'id':title},'query':'query($id:String){Media(search:$id,type:ANIME){description(asHtml:true) siteUrl coverImage{large} title{romaji}}}'}).json()['data']['Media']

src = """
Spirited Away
My Neighbor Totoro
Neko no Ongaeshi 
"""

# Have to get rid of first and last element, due to the above multiline string
for title in src.split('\n')[1:-1]:
    print() # Graphical separation
    m = do_search(title)
    try: # In case there was an issue in the search results
        print(make_sql(m["title"]["romaji"], m["description"]))
    except Exception:
        print(m) # Just print the actual results
