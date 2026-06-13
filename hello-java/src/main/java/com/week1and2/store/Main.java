package com.week1and2.store;

import com.week1and2.store.model.Product;

public class Main {

    public static void main(String[] args) {
        Product laptop = new Product("laptop", 99999.99);
        Product laptop1 = new Product("laptop1", 999.99);
        Product laptop2 = new Product("laptop2", 99.99);
        Product laptop3 = new Product("laptop3", 93.99);
        Product laptop4 = new Product("laptop4", 4.49);

        System.out.println(laptop.toString());
        System.out.println(laptop2.toString());
        System.out.println(laptop3.toString());
        System.out.println(laptop4.toString());
        System.out.println(laptop1.toString());

        System.out.println(Product.getTotalCreated());

    }
    
}
