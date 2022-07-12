TODO Docker 
	volume

TODO Lombok
	[x] data

TODO SQL
	[x] primary key
	[x] unique key
	[x] auto increment

TODO Git
	[x] publish to github

TODO Structure
	[x] package

[x] TODO Spring Magic

TODO Angular
	- [x] Observable (rxjs)
	- [x] Binding
		- [x] ngModel

If keycloak borks, implement very basic auth
	- frontend -> username/pass hash
	- backend -> verify hashes, send random string as token
	- frontend -> send token with requests

[x] Basic auth with plaintext password, hardcoded in java code.

TODO frontend
	- [x] add types
	- [x] move .subscribe to components
	- [x] ngOnInit
	- [x] routerModule, routerLink
		optional: - activated route

# ***UPDATE THE REPO***
	- [x] AT LEAST, AT 30th OF NOVEMBER (HAS TO BE WORKING)

# *STYLE*
	- form
	- main output

TODO message upon failed login

TODO AniList pulling script
	- py
    title, description, genres, anilist's id (still include autoincrement primary key)
    optional - cover image

	[x] py script, pulls given searchable name the romanized title and description. Spits out SQL for manual checking. Entries have to be filtered manually, thus only 5 entries.

TODO pull users from DB
	- not sure how to do dynamically, can only pull once on server start.

TODO show anidata on frontend (/main)
	[x] done, backend freaks out on requests to /main, works only on the frontend.

TODO change VARCHAR(4096) to TEXT in db
	

#### TODO this for week
	[x] Script
	- Genres

## LEFT:

#### Push till friday
- [x] css
- [x] move services to their own dirs
- [x] varchar -> text (seems like a primary key cannot be TEXT)
- [x] image covers


- [x] new route for per-anime entry
- [x] addition - tags [[./tags.org]]
- [x] login change background of placeholder


- message upon failed login
- pull users from DB (work around spring)
- handling of big amounts of entries
