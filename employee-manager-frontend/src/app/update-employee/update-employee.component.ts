import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})

export class UpdateEmployeeComponent {
  employee: Employee = new Employee();

  constructor(private employeeService: EmployeeService, private router: Router) {} 

  updateEmployee() {
    this.employeeService.updateEmployee(this.employee).subscribe(data => {
      console.log(data);
      this.goToList();
    },
    (error: any) => console.log(error));
  }

  goToList() {
    this.router.navigate(['/update-employee']);
  }

  onSubmit() {
    this.updateEmployee();
  }

}
