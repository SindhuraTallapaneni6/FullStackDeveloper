import { Component } from '@angular/core';
import { User } from './models/user';

@Component({
  selector: 'app-root',
  templateUrl : './app.component.html',
  //template: `<button style='color:green' [ngStyle]="MyStyle()">Sindhura Tallapaneni</button>`  ,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Tour of Heroes';
  //user1 =new User(101,'sindhu','sindhu@gmail.com',7689786789);
  // user2=new User(102,'tanu','tanu@gmail.com',6978057689);
  // user3=new User(103,'divya','divya@gmail.com',9879806890);
  // message='hello child';


  // messagefromchild:string;
  // setMessage(message:string){
  //   this.messagefromchild=message;

  
		isBold: boolean = true;    
		fontSize: number = 30;    
		isItalic: boolean = true;    
    
    MyStyle() {    
        let mystyles = {    
            'font-weight': this.isBold ? 'bold' : 'normal',    
            'font-style': this.isItalic ? 'italic' : 'normal',    
            'font-size.px': this.fontSize    
        };    
    
        return mystyles;    
		}    
	
  

// callMe(){
//     alert('Welcome :' +this.user1.name);
//   }  

}