import { Component, OnInit } from '@angular/core';
import { MatIconRegistry } from '@angular/material/icon';
import { DomSanitizer } from '@angular/platform-browser';

import Map from 'ol/Map.js';
import View from 'ol/View.js';
import {Tile, Vector as VectorLayer} from 'ol/layer.js';
import {OSM, Vector as VectorSource} from 'ol/source.js';
import { fromLonLat }  from 'ol/proj.js'

import { Router } from '@angular/router';

const bulgariaSchool = [ 23.331589,42.698878];
const bulgariaSchoolWebMercator = fromLonLat(bulgariaSchool);

@Component({
  selector: 'app-bulgaria-university',
  templateUrl: './bulgaria-university.component.html',
  styleUrls: ['./bulgaria-university.component.scss']
})
export class BulgariaUniversityComponent implements OnInit {
  map = undefined;


  constructor(
    private matIconRegistry: MatIconRegistry,
    private domSanitizer: DomSanitizer,
    private router: Router
  ) {
    this.matIconRegistry.addSvgIcon(
      'germany',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/germanyFlag.svg')
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
        center: bulgariaSchoolWebMercator,
        zoom: 15
      })
    });

  }

  programsNavigate(){
    this.router.navigateByUrl('/Universities/Bulgaria/StudyPrograms')
  }

}
