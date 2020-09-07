import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
// export class AppComponent {
//   title = 'frontend';
// }
export class AppComponent {
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
}