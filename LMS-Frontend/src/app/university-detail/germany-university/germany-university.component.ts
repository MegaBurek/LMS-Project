import { Component, OnInit } from '@angular/core';
import { MatIconRegistry } from '@angular/material/icon';
import { DomSanitizer } from '@angular/platform-browser';

import Map from 'ol/Map.js';
import View from 'ol/View.js';
import {Tile, Vector as VectorLayer} from 'ol/layer.js';
import {OSM, Vector as VectorSource} from 'ol/source.js';
import { fromLonLat }  from 'ol/proj.js'
import { Router } from '@angular/router';



const germanySchool = [ 10.047189,53.555378];
const germanySchoolWebMercator = fromLonLat(germanySchool);

@Component({
  selector: 'app-germany-university',
  templateUrl: './germany-university.component.html',
  styleUrls: ['./germany-university.component.scss']
})
export class GermanyUniversityComponent implements OnInit {
  raster = undefined;
  source = undefined;
  vector = undefined;
  map = undefined;
  draw = undefined;
  drawingFeatures: any = [];


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
        center: germanySchoolWebMercator,
        zoom: 15
      })
    });

  }

  facultyNavigate(){
    this.router.navigateByUrl('/germany-faculties')
  }
}
