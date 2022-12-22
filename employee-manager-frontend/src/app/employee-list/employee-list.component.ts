import { Component } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {
  employees?: Employee[];
  ngOnInit(): void {
    this.employees = [
      {
        "id": 1,
        "firstName": "Thor",
        "lastName": "Odin",
        "email": "thor.odin@gmail.com"
      },
      {
        "id": 2,
        "firstName": "Scarlett",
        "lastName": "Black",
        "email": "blackwidow@ymail.com"
      },
    ]
  }
}
