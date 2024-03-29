import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent} from '../app/login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { UsersComponent } from './user/users/users.component';
import { UpdateUsersComponent} from './user/update-users/update-users.component';
import { HomeComponent } from '../app/home/home.component';
import { AdminLandingComponent } from '../app/admin-landing/admin-landing.component';
import { UserlandingComponent } from '../app/userlanding/userlanding.component';
import { ImportdataComponent } from '../app/importdata/importdata.component';
import { CompareCompanyComponent } from '../app/compare-company/compare-company.component';
import {  ManagecompanyComponent } from '../app/managecompany/managecompany.component'
import { AuthGuard } from './auth.guard';
import { ChartsComponent } from './charts/charts.component';


const routes: Routes = [
  {path:'home', component: HomeComponent},
  {path:'login',component: LoginComponent},
  {path:'sign-up',component: SignUpComponent},
  { path: 'users', component:UsersComponent, canActivate: [AuthGuard]},
  { path: 'update-user', component:UpdateUsersComponent},
  { path: 'adminlanding', component:AdminLandingComponent},
  {path:'userlanding',component:UserlandingComponent},
  { path:'importdata',component:ImportdataComponent},
  { path:'compare-company',component:CompareCompanyComponent},
  { path:'managecompany', component:ManagecompanyComponent },
  { path:'charts', component:ChartsComponent}
  
 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

  
 }
