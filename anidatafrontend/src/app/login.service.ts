import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

	username: string = "";
	password: string = "";

	login(username: string, password: string): void {
		this.username = username;
		this.password = password;
	}
}
