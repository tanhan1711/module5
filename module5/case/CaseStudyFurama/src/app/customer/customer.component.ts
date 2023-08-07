import { Component, OnInit } from '@angular/core';
import {Icustomer} from "../icustomer";
@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  constructor() { }
   customers:Icustomer[]=[{ id:1,name:'Nhan',birthday:'17-11-2000',card:321123123,phone:'0151233',email:'asdjadhkj@gmail.com',address:'12 thanh long',type:'Gold',action:''
   }]
  ngOnInit(): void {
  }

}
