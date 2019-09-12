import { Component, OnInit } from '@angular/core';
import { MatIconRegistry } from '@angular/material/icon';
import { DomSanitizer } from '@angular/platform-browser';

@Component({
  selector: 'app-germany-university',
  templateUrl: './germany-university.component.html',
  styleUrls: ['./germany-university.component.scss']
})
export class GermanyUniversityComponent implements OnInit {

  constructor(
    private matIconRegistry: MatIconRegistry,
    private domSanitizer: DomSanitizer
  ) {
    this.matIconRegistry.addSvgIcon(
      'germany',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/germanyFlag.svg')
    )
   }

  ngOnInit() {
  }

}
