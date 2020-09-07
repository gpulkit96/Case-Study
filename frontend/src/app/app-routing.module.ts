import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompareChartsComponent } from './components/compare-charts/compare-charts.component';
import { NewCompanyComponent } from './components/new-company/new-company.component';
import { UploadExcelComponent } from './components/upload-excel/upload-excel.component';
import { ManageCompaniesComponent } from './components/manage-companies/manage-companies.component';
const routes: Routes = [
  {path: 'home', component: CompareChartsComponent},
  {path: 'new-company', component: NewCompanyComponent},
  {path: 'upload-excel', component: UploadExcelComponent},
  {path: 'manage-companies', component:ManageCompaniesComponent},
  {path: "**", pathMatch: 'full', redirectTo: 'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
