import { Component, OnInit } from '@angular/core';
import {ProductsProviderService} from '../products-provider/products-provider.service';
import {Cart} from '../cart';
import {Product} from '../product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

    cart: Cart;
    products: Product[];

  constructor(private productsProvider: ProductsProviderService) { }

  ngOnInit() {
    this.productsProvider.getCart().subscribe(cart => {
          this.cart = cart;
          this.products = cart.selected;
        }
    );
  }
}
