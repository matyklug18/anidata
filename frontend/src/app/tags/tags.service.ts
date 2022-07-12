import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';

import { Tag } from './tag.type';

@Injectable({
  providedIn: 'root'
})
export class TagsService {

  constructor(
    private http: HttpClient
  ) { }

  getTagsById(id: number): Observable<Tag[]> {
    return this.http.get<Tag[]>("/api/private/tags/"+id);
  }
}
