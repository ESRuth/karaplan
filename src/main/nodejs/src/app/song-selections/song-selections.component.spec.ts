import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { SongSelectionsComponent } from './song-selections.component';

describe('SongSelectionsComponent', () => {
  let component: SongSelectionsComponent;
  let fixture: ComponentFixture<SongSelectionsComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ SongSelectionsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SongSelectionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
