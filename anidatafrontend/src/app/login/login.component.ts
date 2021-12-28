import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from "@angular/router";

import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	constructor(private login: LoginService, private route: Router) {}


  ngOnInit(): void {
  }

	onSubmit(form: NgForm) {
		const values = form.form.value;
		this.login.login(values.username, values.password);
		this.route.navigate(["/main"]);
  }
}
