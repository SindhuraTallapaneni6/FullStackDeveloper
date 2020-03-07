import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
import { User } from '../../models/user'
import { Router } from '@angular/router';


@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private userService: UserService, private router: Router) { }
  usersData: User[];
  ngOnInit() {
    this.userService.getAllUsers().subscribe(data => {
      this.usersData = data;
  });
}
deleteUser(user : User){
  this.userService.deleteUser(user.id).subscribe();
  this.usersData = this.usersData.filter(u => user != user);
}
updateUser(user : User){
  localStorage.removeItem('userId');
  localStorage.setItem('userId', user.id.toString());
  this.router.navigate(['update-user']);
}

}
