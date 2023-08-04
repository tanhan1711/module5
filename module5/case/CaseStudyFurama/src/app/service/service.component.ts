import { Component, OnInit } from '@angular/core';
import { IService} from "../iservice";

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {

  constructor() {
  }
  services:  IService[] = [
    {id: 1, name: 'Room', area : 20, numberFloor : 3,
      maxPeoPle: 100, cost: 10000000, rent_Type: 'day', status: true},
    {id: 2, name: 'Room', area : 30, numberFloor : 4,
      maxPeoPle: 100, cost: 1000000, rent_Type: 'day', status: true}
  ];
  ngOnInit(): void {
  }

}
