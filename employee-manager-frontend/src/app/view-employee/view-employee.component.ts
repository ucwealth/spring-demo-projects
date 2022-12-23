import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent {
  id: number = 0;
  employee: Employee = new Employee()
  constructor(private employeeService: EmployeeService, private route: ActivatedRoute) {}

  ngOnInit() {
    this.id = this.route.snapshot.params['id']
    this.employeeService.getEmployeeById(this.id).subscribe(data => {
      this.employee = data 
      console.log(data)
    })
  }

}
