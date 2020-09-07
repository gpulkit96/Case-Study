import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompareChartsComponent } from './components/compare-charts/compare-charts.component';
import { NewCompanyComponent } from './components/new-company/new-company.component';
import { UploadExcelComponent } from './components/upload-excel/upload-excel.component';
import { ManageCompaniesComponent } from './components/manage-companies/manage-companies.component';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { LoginGuard } from './guards/login.guard';
import { SignupGuard } from './guards/signup.guard';

const routes: Routes = [
  {path: 'home', component: CompareChartsComponent},
  {path: 'new-company', component: NewCompanyComponent},
  {path: 'upload-excel', component: UploadExcelComponent},
  {path: 'manage-companies', component:ManageCompaniesComponent},
  {path: 'login', component:LoginComponent, canActivate:[SignupGuard]},
  {path: 'signup', component:SignupComponent, canActivate:[SignupGuard]},
  {path: "**", pathMatch: 'full', redirectTo: 'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
