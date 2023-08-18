import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CategoryListComponent} from "../category/category-list/category-list.component";
import {CategoryCreateComponent} from "../category/category-create/category-create.component";
import {CategoryEditComponent} from "../category/category-edit/category-edit.component";
import {CategoryDeleteComponent} from "../category/category-delete/category-delete.component";
import {ProductListComponent} from "./product-list/product-list.component";
import {ProductCreateComponent} from "./product-create/product-create.component";
import {ProductUpdateComponent} from "./product-update/product-update.component";
import {ProductDeleteComponent} from "./product-delete/product-delete.component";


const routes: Routes = [{
  path: 'list',
  component: ProductListComponent
},
  {
    path: 'create',
    component: ProductCreateComponent
  },
  {
    path: 'update/:id',
    component: ProductUpdateComponent
  },
  {
    path: 'delete/:id',
    component: ProductDeleteComponent
  },];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductRoutingModule { }
