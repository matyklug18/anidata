import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

import { UsersService } from '../users.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	constructor(private users: UsersService) {}


  ngOnInit(): void {
  }

	onSubmit(form: NgForm) {
		var values = form.form.value;
		this.users.login(values.username, values.password);
  }
}
