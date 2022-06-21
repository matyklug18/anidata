import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';

import { Show } from './show.type';

@Injectable({
  providedIn: 'root'
})
export class ShowsService {

  constructor(
		private http: HttpClient
	) { }

	getShows(): Observable<Show[]> {
		return this.http.get<Show[]>("/api/private/shows");
	}
}
