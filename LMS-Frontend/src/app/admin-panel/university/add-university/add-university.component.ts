import { Component, OnInit, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-add-university',
  templateUrl: './add-university.component.html',
  styleUrls: ['./add-university.component.scss']
})
export class AddUniversityComponent implements OnInit {

  constructor( ) {
                }


  ngOnInit() {
  //   //onemogucavamo inpute jer ce vrednosti biti automatski unesene
  //   this.form.get("city").disable();
  //   this.form.get("country").disable();

  // this.universityService.getAllAddress().subscribe(
  //   data => {
  //     this.address = data.map(item =>{
  //         return{
  //           id: item.id,
  //           street: item.street,
  //           number: item.number,
  //           placeDto: item.placeDto,
  //           // country:item.country
  //         };

  //     })

  //   }
  // )
  }

  //ovako se dohvata vrednost na promenu mat-select
  // setCityCountry($event){
    
  //   this.form.get("city").setValue($event.placeDto.name);
  //   this.form.get("country").setValue($event.placeDto.countryDto.name);
  //   this.university.address.id = $event.id;
  // }


  //  onSubmit(){
  //    this.university.name = this.form.get("name").value;
  //    this.university.year = this.form.get("date").value;
      
  //   console.log( this.university)
  //   this.universityService.addNewUniversity(this.university).subscribe();
  //   this.openSnackBar("You have successfully added University", "Close");
  //  //treba dodati notifikaciju i redirektovati

  //  }


  
  // openSnackBar(message: string, action: string) {
  //   this.snackBar.open(message, action, {
  //     duration: 3000,
  //   });
  // }

}
