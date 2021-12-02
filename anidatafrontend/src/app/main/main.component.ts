import { Component, OnInit } from '@angular/core';

import { Observable } from 'rxjs';

import { UsersService } from '../users.service';

import { User } from '../user.type';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

	constructor(private users: UsersService) {}

	usersList: Observable<User[]> | null = null;

  ngOnInit(): void {
		this.usersList = this.users.getUsers();
  }
}
