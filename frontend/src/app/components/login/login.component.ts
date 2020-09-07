import { Component, OnInit } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import {NgForm} from '@angular/forms';
import { User } from './User';
// const httpOptions = {
//   headers: new HttpHeaders({
//     'Content-Type': 'application/json'
//   })
// };

const headers = {'Content-Type': 'application/json'}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(private http:HttpClient) {}
  
  user= new User();
  login:boolean;
  ngOnInit(): void {
  }
  onSubmit(form: NgForm){
    console.log('form value: ', form.value);
    this.user.addUser(form.value.username, form.value.password);
    this.http.post<boolean>('http://localhost:8085/users/login', this.user ,{ headers }).subscribe(data=>{
      this.login=data;
      console.log(data);
    }
    )
  }
}
