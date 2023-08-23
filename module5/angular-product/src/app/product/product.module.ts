import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductRoutingModule } from './product-routing.module';
import {NgxPaginationModule} from "ngx-pagination";


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ProductRoutingModule,
    NgxPaginationModule,
  ]
})
export class ProductModule { }
