import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-compare-company',
  templateUrl: './compare-company.component.html',
  styleUrls: ['./compare-company.component.css']
})
export class CompareCompanyComponent implements OnInit {
  comparecompany:FormGroup;
  constructor(private router: Router) { }

  ngOnInit() {
  }

  onSubmit(){
    this.router.navigate(['/charts'],{
      queryParams:{
        formData : JSON.stringify(this.comparecompany.value)
      }
    });
  }

}
