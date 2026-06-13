package com.week1and2.receipt;

import java.util.Scanner;

/*### Exercise 5.3 — Coding: Formatted Receipt

Build a program that reads the following from the user using `Scanner`:

- Store name (String)
- Item name (String)
- Quantity (int)
- Unit price (double)

Then print a formatted receipt like this (values will vary): */

public class Receipt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("store name");
        String store = s.nextLine();

        System.out.println("item name");
        String item = s.nextLine();

        System.out.println("quantity");
        int quantity = s.nextInt();

        s.nextLine();

        System.out.println("price per item");
        double price = s.nextDouble();

        double total = quantity * price;

        double vat = total * 0.21;

        System.out.println(store);
        System.out.println(item);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(total);
        System.out.println(vat);

        s.close();

    }
}
