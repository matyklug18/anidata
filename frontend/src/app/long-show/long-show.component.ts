import { Component, OnInit } from '@angular/core';

import { Observable } from 'rxjs';
import { ActivatedRoute, Params } from "@angular/router";
import { TagsService } from '../tags/tags.service';
import { ShowsService } from '../shows/shows.service';

import { Show } from '../shows/show.type';
import { Tag } from '../tags/tag.type';


@Component({
  selector: 'app-long-show',
  templateUrl: './long-show.component.html',
  styleUrls: ['./long-show.component.css']
})
export class LongShowComponent implements OnInit {

  constructor(private route: ActivatedRoute, private tagsService: TagsService, private showsService: ShowsService) { }

  show: Observable<Show> | null = null;
  tags: Observable<Tag[]> | null = null;

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.show = this.showsService.getShowById(params["id"]);
      this.tags = this.tagsService.getTagsById(params["id"]);
    });
  }
}
