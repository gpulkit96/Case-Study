import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { NewCompanyComponent } from './components/new-company/new-company.component';
import { UploadExcelComponent } from './components/upload-excel/upload-excel.component';
import { CompareChartsComponent } from './components/compare-charts/compare-charts.component';
import { ManageCompaniesComponent } from './components/manage-companies/manage-companies.component';

@NgModule({
  declarations: [
    AppComponent,
    NewCompanyComponent,
    UploadExcelComponent,
    CompareChartsComponent,
    ManageCompaniesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
