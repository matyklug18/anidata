import { Component, OnInit } from '@angular/core';

import { Observable } from 'rxjs';

import { ShowsService } from '../shows/shows.service';

import { Show } from '../shows/show.type';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

	constructor(private shows: ShowsService) {}

	showsList: Observable<Show[]> | null = null;

  ngOnInit(): void {
		this.showsList = this.shows.getShows();
  }
}
