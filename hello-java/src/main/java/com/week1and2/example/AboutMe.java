package com.week1and2.example;

/*### Exercise 1.3 — Coding: Your First Program

Create a class called `AboutMe` with a `main` method that prints the following (replace the values with your own):

```
Name    : Alice van der Berg
City    : Rotterdam
Track   : Backend — Java
Goal    : Become a backend developer
```

Requirements:

- Each label must be left-aligned and consistent (hint: use `printf` or manual spacing)
- Run it from IntelliJ and confirm the output matches exactly */

/*Product  : Mechanical Keyboard
Quantity : 2
Price    : €79.99 each
Total    : €159.98
In stock : true */

public class AboutMe {

    public static void main(String[] args) {
        String name = "Daniil";
        String city = "Amsterdam";
        String track = "Backend";
        String goal = "not to burn out";
        System.out.printf("Name : %4s%ncity: %4s%ntrack: %4s%ngoal: %4s", name, city, track, goal);

        String product = "Mechanical Keyboard";
        int quantity = 4;
        double price = 69.69;
        boolean inStock = true;

        double total = price * quantity;

        System.out.printf("product : %4s%nquantity: %4d%nprice: %.2f%nIn stock: %4b%ntotal: %.2f", product, quantity,
                price, inStock, total);
    }

}
