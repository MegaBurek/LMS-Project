import { Component, OnInit } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { MatIconRegistry } from '@angular/material/icon';

@Component({
  selector: 'app-russia-university',
  templateUrl: './russia-university.component.html',
  styleUrls: ['./russia-university.component.scss']
})
export class RussiaUniversityComponent implements OnInit {

  constructor(
    private matIconRegistry: MatIconRegistry,
    private domSanitizer: DomSanitizer
  ) {
    this.matIconRegistry.addSvgIcon(
      'russia',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/russiaFlag.svg')
    )
   }

  ngOnInit() {
  }

}
