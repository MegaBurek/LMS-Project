import { Component, OnInit } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { MatIconRegistry } from '@angular/material/icon';

import Map from 'ol/Map.js';
import View from 'ol/View.js';
import {Tile, Vector as VectorLayer} from 'ol/layer.js';
import {OSM, Vector as VectorSource} from 'ol/source.js';
import { fromLonLat }  from 'ol/proj.js'
import { Router } from '@angular/router';

const russiaSchool = [ 37.605596,55.748623];
const russiaSchoolWebMercator = fromLonLat(russiaSchool);

@Component({
  selector: 'app-russia-university',
  templateUrl: './russia-university.component.html',
  styleUrls: ['./russia-university.component.scss']
})
export class RussiaUniversityComponent implements OnInit {
  map = undefined;

  constructor(
    private matIconRegistry: MatIconRegistry,
    private domSanitizer: DomSanitizer,
    private router: Router
  ) {
    this.matIconRegistry.addSvgIcon(
      'russia',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/russiaFlag.svg')
    )
   }

   ngOnInit() {
    this.map = new Map({
      target: 'map',
      layers: [
        new Tile({
          source: new OSM()
        })
      ],
      view: new View({
        center: russiaSchoolWebMercator,
        zoom: 15
      })
    });

  }

  facultyNavigate(){
    this.router.navigateByUrl('/russia-faculties')
  }

}
