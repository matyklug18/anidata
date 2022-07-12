import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LongShowComponent } from './long-show.component';

describe('LongShowComponent', () => {
  let component: LongShowComponent;
  let fixture: ComponentFixture<LongShowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LongShowComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LongShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
