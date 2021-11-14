import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

	static token: string = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTYzNTg3Mjk2NSwiaWF0IjoxNjM1ODU0OTY1fQ.nCvMpRo1N7C1Zh6Km65sexknBm2QUq4qiXTe0H-ba0WU0hOT7GtH5pqrVEobx2R04Jfg6ru0lH63IAFPwQcYIg";
	authed: boolean = false;

  constructor(
		private http: HttpClient
	) { }

	getUsers() {
		return this.http.get<{id: number, username: string, password: string}[]>("/api/users");
	}

	static getToken() {
		return this.token;
	}

	login(username: string, password: string) {
		this.http.post<{token: string}>("/auth", {
			username: username, password: password
		}).subscribe(data => {
			UsersService.token = data.token;
			this.authed = true;
		})
	}

	getAuthed() {
		return this.authed;
	}
}
