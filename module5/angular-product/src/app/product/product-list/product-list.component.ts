import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../service/product.service";
import {Product} from "../../model/product";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  p = 1;
  product: Product;
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.getAll();
  }

  private getAll() {
    this.productService.getAll().subscribe(products => {
      this.products = products;
    });
  }
  // search(inputSearch: HTMLInputElement) {
  //     this.productService.search(inputSearch.value).subscribe(next => {
  //       this.products = next;
  //     });
  //   }
  removeProduct(id: number | undefined) {
    this.productService.deleteProduct(this.product.id).subscribe(() => {
      this.getAll();
    });
  }
  getProduct(id: number){
    this.productService.findById(id).subscribe(data =>{
      this.product = data;
    })
  }

  search1(inputName: HTMLInputElement, inputPrice: HTMLInputElement) {
    if (inputName.value === null && inputPrice.value === null) {
    } else {
      this.productService.search(inputName.value, inputPrice.value).subscribe(next => {
        this.products = next;
        console.log(this.products);
      });
    }
  }
}
