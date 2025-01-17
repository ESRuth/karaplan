import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { DragDropModule } from '@angular/cdk/drag-drop';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PlyrModule } from 'ngx-plyr';

import { DurationPipe } from './pipes/duration.pipe';
import { SongListComponent } from './song-list/song-list.component';
import { SongActionsComponent } from './song-actions/song-actions.component';
import { SongSelectionsComponent } from './song-selections/song-selections.component';
import { PlaylistEditModalComponent } from './playlist-edit-modal/playlist-edit-modal.component';
import { PlaylistLeaveModalComponent } from './playlist-leave-modal/playlist-leave-modal.component';

@NgModule({
  declarations: [
    DurationPipe,
    SongListComponent,
    SongActionsComponent,
    SongSelectionsComponent,
    PlaylistEditModalComponent,
    PlaylistLeaveModalComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    RouterModule,
    DragDropModule,
    NgbModule,
    PlyrModule
  ],
  exports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    NgbModule,
    DurationPipe,
    SongListComponent,
    SongActionsComponent,
    SongSelectionsComponent,
    PlaylistEditModalComponent,
    PlaylistLeaveModalComponent
  ]
})
export class SharedModule { }
