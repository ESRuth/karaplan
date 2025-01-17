import { NgModule } from '@angular/core';
import { PlyrModule } from 'ngx-plyr';

import { SharedModule } from '../shared/shared.module';
import { SongsRoutingModule } from './songs-routing.module';
import { SongsComponent } from './songs.component';
import { SongDetailComponent } from './song-detail/song-detail.component';

@NgModule({
  declarations: [
    SongsComponent,
    SongDetailComponent
  ],
  imports: [
    SharedModule,
    PlyrModule,
    SongsRoutingModule
  ]
})
export class SongsModule { }
