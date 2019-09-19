import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LogInComponent } from './log-in/log-in.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './admin-panel/register/register.component';
import { MaterialsPageComponent } from './materials-page/materials-page.component';
import { MaterialDetailComponent } from './material-detail/material-detail.component';
import { AdminPanelComponent } from './admin-panel/admin-panel.component';
import { TeacherPanelComponent } from './teacher-panel/teacher-panel.component';
import { StudentPanelComponent } from './student-panel/student-panel.component';
import { UniversityComponent} from './admin-panel/university/university/university.component';
import { UserManagementComponent } from './admin-panel/user-management/user-management.component';
import { AddAddressComponent } from './administrative-panel/add-address/add-address.component';
// import { StudyProgramComponent } from './faculties/study-program/study-program.component';
import { AdministrativePanelComponent } from './administrative-panel/administrative-panel.component';

import { GermanyUniversityComponent } from './university-detail/germany-university/germany-university.component';
import { RussiaUniversityComponent } from './university-detail/russia-university/russia-university.component';
import { BulgariaUniversityComponent } from './university-detail/bulgaria-university/bulgaria-university.component';

import { BulgariaStudyProgramsComponent } from './study-programs/bulgaria-study-programs/bulgaria-study-programs.component';
import { RussiaStudyProgramsComponent } from './study-programs/russia-study-programs/russia-study-programs.component';
import { GermanyStudyProgramsComponent } from './study-programs/germany-study-programs/germany-study-programs.component';
 

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LogInComponent, data: { animation: { value: 'LoginPage' }} },
  { path: 'home', component: HomeComponent, data: { animation: { value: 'HomePage' }} },
  { path: 'admin-panel', component: AdminPanelComponent, data: { animation: { value: 'AdminPanelPage' }} },
  { path: 'admin-panel/register', component: RegisterComponent, data: { animation: { value: 'RegisterPage' }} },
  { path: 'admin-panel/user-management', component: UserManagementComponent, data: { animation: { value: 'UserManagementPage' }} },
  { path: 'admin-panel/university', component:UniversityComponent, data: {animation : {value:'UniversityPage'}}},
  { path: 'admin-panel/add-address', component: AddAddressComponent, data: { animation: { value: 'AddAddressPage' }} },
  { path: 'teacher-panel', component: TeacherPanelComponent, data: { animation: { value: 'TeacherPanelPage' }} },
  { path: 'administrator-panel', component: AdministrativePanelComponent, data : {animation: { value: 'AdministrativePanelPage'}}},
  { path: 'student-panel', component: StudentPanelComponent, data: { animation: { value: 'StudentPanelPage' }} },
  { path: 'materials', component: MaterialsPageComponent, data: { animation: { value: 'MaterialsPage' }} },
  { path: 'materials/subject/:id', component: MaterialDetailComponent, data: { animation: { value: 'MaterialDetailPage' }} },
  { path: 'Universities/Germany', component: GermanyUniversityComponent, data: { animation: { value: 'GermanyUniversityDetailPage' }} },
  { path: 'Universities/Bulgaria', component: BulgariaUniversityComponent, data: { animation: { value: 'BulgariaUniversityDetailPage' }} },
  { path: 'Universities/Russia', component: RussiaUniversityComponent, data: { animation: { value: 'RussiaUniversityDetailPage' }} },
  { path: 'Universities/Russia/StudyPrograms', component: RussiaStudyProgramsComponent, data: { animation: { value: 'RussiaStudyProgramsPage' }} },
  { path: 'Universities/Germany/StudyPrograms', component: GermanyStudyProgramsComponent, data: { animation: { value: 'GermanyStudyProgramsPage' }} },
  { path: 'Universities/Bulgaria/StudyPrograms', component: BulgariaStudyProgramsComponent, data: { animation: { value: 'BulgariaStudyProgramsPage' }} }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
