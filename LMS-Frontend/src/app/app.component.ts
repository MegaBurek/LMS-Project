import { Component } from '@angular/core';
import {trigger, animate, style, group, animateChild, query, stagger, transition} from '@angular/animations';
import { MatIconRegistry } from "@angular/material/icon";
import { DomSanitizer } from '@angular/platform-browser';

// Animations
const fade = [
  query(':self', 
    [
      style({ opacity: 0 })
    ], 
    { optional: true }
  ),

  query(':self',
    [
      style({ opacity: 0 }),
      animate('.7s ease-in', style({ opacity: 1 }))
    ], 
    { optional: true }
  )
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  animations: [
    trigger('routerAnimations', [
      transition('* => *', fade)
    ])
  ]
})
export class AppComponent {

  constructor(
    private matIconRegistry: MatIconRegistry,
    private domSanitizer: DomSanitizer
  ){
    this.matIconRegistry.addSvgIcon(
      'germany',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/germanyFlag.svg')
    )
    this.matIconRegistry.addSvgIcon(
      'russia',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/russiaFlag.svg')
    )
    this.matIconRegistry.addSvgIcon(
      'bulgaria',
      this.domSanitizer.bypassSecurityTrustResourceUrl('../assets/images/bulgarijaFlag.svg')
    )
  }
  
  prepareRouteTransition(outlet) {
    const animation = outlet.activatedRouteData['animation'] || {};
    return animation['value'] || null;
  }

}
