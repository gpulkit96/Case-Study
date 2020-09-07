import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { FormBuilder } from '@angular/forms';
// import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-upload-excel',
  templateUrl: './upload-excel.component.html',
  styleUrls: ['./upload-excel.component.scss']
})
export class UploadExcelComponent implements OnInit {

  emps = [];
  message = null;
  fetch;
 public constructor(private http:HttpClient){

  this.fetch = this.http.get("http://dummy.restapiexample.com/api/v1/employees") // can be the link for our github repo with data
   .subscribe((res:any)=>{
     console.log(res);

     if(res.status=="success"){
       this.emps = res.data;
       this.message = null;
     } else {
       this.message = "Data not found";
     }
    })
 }
 ngOnDestroy(){
  this.fetch.unsubscribe();
 }
  ngOnInit(): void {
  }

}
