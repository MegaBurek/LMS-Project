import { Component, OnInit, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-add-faculty',
  templateUrl: './add-faculty.component.html',
  styleUrls: ['./add-faculty.component.scss']
})
export class AddFacultyComponent implements OnInit {

  // form : FormGroup;
  // address: AddressDto[];
  // university: University[];
  // faculty: Faculty = new Faculty();

  constructor() {
              }

  ngOnInit() {
    //     onemogucavamo inpute jer ce vrednosti biti automatski unesene
    //     this.form.get("city").disable();
    //     this.form.get("country").disable();

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
    //   })


      
    // this.universityService.getAllUniversities().subscribe(
    //   data => {
    //     this.university = data.map(item =>{
    //         return{
    //           id: item.id,
    //           name: item.name,
    //           year: item.year,
    //           address: item.address
    //         };
    //     })
    //   })
  }

  // setCityCountry($event){
     
  //   this.form.get("city").setValue($event.placeDto.name);
  //   this.form.get("country").setValue($event.placeDto.countryDto.name);
  //   this.faculty.address.id = $event.id;
  //   console.log($event);
  // }

  // onSubmit(selectedUniversity){
  //   this.faculty.name = this.form.get("name").value;
  //   this.faculty.description= this.form.get("description").value;
  //   //this.faculty.address.id = $event.id;
  //   this.faculty.university.id = selectedUniversity;

  //  console.log( this.faculty)
  //  this.facultyService.addNewFaculty(this.faculty).subscribe();
  //  this.openSnackBar("You have successfully added Faculty", "Close");
  // //treba dodati notifikaciju i redirektovati

  // }
  // openSnackBar(message: string, action: string) {
  //   this.snackBar.open(message, action, {
  //     duration: 3000,
  //   });
  // }
}
