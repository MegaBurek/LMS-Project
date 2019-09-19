import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AgmCoreModule } from '@agm/core';

import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatDialogRef } from '@angular/material/dialog'
import { MaterialModule } from './material';
import { FlexLayoutModule } from '@angular/flex-layout';

import { LogInComponent } from './log-in/log-in.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './admin-panel/register/register.component';
import { MaterialsPageComponent } from './materials-page/materials-page.component';
import { MaterialDetailComponent } from './material-detail/material-detail.component';
import { AdminPanelComponent } from './admin-panel/admin-panel.component';
import { TeacherPanelComponent } from './teacher-panel/teacher-panel.component';
import { StudentPanelComponent } from './student-panel/student-panel.component';
import { UniversityComponent } from './admin-panel/university/university/university.component';
import { AddUniversityComponent } from './admin-panel/university/add-university/add-university.component';
import { AdministrativePanelComponent } from './administrative-panel/administrative-panel.component';
import { UserManagementComponent } from './admin-panel/user-management/user-management.component';
import { AddAddressComponent } from './administrative-panel/add-address/add-address.component';
// import { StudyProgramComponent } from './faculties/study-program/study-program.component';
// import { AddStudyProgramComponent } from './faculties/study-program/add-study-program/add-study-program.component';
import { LoginErrorDialogComponenet } from './log-in/loginErrorDialog.component';

import { BulgariaUniversityComponent } from './university-detail/bulgaria-university/bulgaria-university.component';
import { RussiaUniversityComponent } from './university-detail/russia-university/russia-university.component';
import { GermanyUniversityComponent } from './university-detail/germany-university/germany-university.component';
import { BulgariaStudyProgramsComponent } from './study-programs/bulgaria-study-programs/bulgaria-study-programs.component';
import { GermanyStudyProgramsComponent } from './study-programs/germany-study-programs/germany-study-programs.component';
import { RussiaStudyProgramsComponent } from './study-programs/russia-study-programs/russia-study-programs.component';


@NgModule({
  exports: [
    FormsModule,
    ReactiveFormsModule
  ],
  declarations: [
    AppComponent,
    LogInComponent,
    LoginErrorDialogComponenet,
    HomeComponent,
    RegisterComponent,
    MaterialsPageComponent,
    MaterialDetailComponent,
    AdminPanelComponent,
    TeacherPanelComponent,
    StudentPanelComponent,
    UniversityComponent,
    AddUniversityComponent,
    AdministrativePanelComponent,
    UserManagementComponent,
    AddAddressComponent,
    BulgariaUniversityComponent,
    RussiaUniversityComponent,
    GermanyUniversityComponent,
    BulgariaStudyProgramsComponent,
    RussiaStudyProgramsComponent,
    GermanyStudyProgramsComponent,
    BulgariaStudyProgramsComponent,
    GermanyStudyProgramsComponent,
    RussiaStudyProgramsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FlexLayoutModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBpBl1y_R0y_v50fEAaIomQoImXMvbwQOE'
    })
  ],
  providers: [{provide: MatDialogRef, useValue: {}}], //for some reason we need this here for MatDialogRef
  bootstrap: [AppComponent],
  entryComponents:[RegisterComponent, LoginErrorDialogComponenet]
})
export class AppModule { }
