import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {
  employees?: Employee[];
  constructor(private employeeService: EmployeeService, private router: Router) {

  }

  ngOnInit(): void {
    this.getEmployees();
  }

  private getEmployees() {
    this.employeeService.getEmployeesList().subscribe(data => {
      this.employees = data;
    });
  }

  updateEmployee(id: number | undefined) {
    this.router.navigate(['update-employee', id])
  }

  deleteEmployee(id: number|undefined) {
    this.employeeService.deleteEmployee(id).subscribe(data => {
      console.log(data)
      this.getEmployees()
    })
  }

  viewEmployee(id: number | undefined) {
    this.router.navigate(['/view-employee', id])
  }

}
