import { Component, OnInit } from '@angular/core';
import { MatIconRegistry } from '@angular/material/icon';
import { DomSanitizer } from '@angular/platform-browser';

@Component({
  selector: 'app-bulgaria-university',
  templateUrl: './bulgaria-university.component.html',
  styleUrls: ['./bulgaria-university.component.scss']
})
export class BulgariaUniversityComponent implements OnInit {

  constructor(
    private matIconRegistry: MatIconRegistry,
    private domSanitizer: DomSanitizer
  ) {
    this.matIconRegistry.addSvgIcon(
      'bulgaria',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/bulgarijaFlag.svg')
    )
   }

  ngOnInit() {
  }

}
