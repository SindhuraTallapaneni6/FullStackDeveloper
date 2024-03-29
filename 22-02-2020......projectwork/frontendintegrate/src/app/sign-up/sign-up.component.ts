import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
    signupform :FormGroup
  constructor(private formBuilder:FormBuilder, private userService:UserService) { }

  ngOnInit() {
    this.signupform=this.formBuilder.group({
      id:['',[Validators.required]],
      firstname:['',[Validators.required]],
      lastname:['',[Validators.required]],
      username:['',[Validators.required]],
      email:['',[Validators.required]],
      password:['',[Validators.required]],
      repassword:['',[Validators.required]],
      phone:['',[Validators.required]],
      otp:['',[Validators.required]]
    })
  }
  addUser(){
    this.userService.saveUser(this.signupform.value).subscribe(data => {
      console.log('User Inserted Successfully');
    });
 }

  onSubmit(){
    console.log(this.signupform.value);

  }

}
