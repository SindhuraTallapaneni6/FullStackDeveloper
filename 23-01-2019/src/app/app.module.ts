import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { RegisterComponent } from './user/register/register.component';
import { HeroesComponent } from './heroes/heroes.component';
import { RedDirective } from './red.directive';
import { AngularformComponent } from './angularform/angularform.component';
import { UserComponent } from './forms/user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    HeroesComponent,
    RedDirective,
    AngularformComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
