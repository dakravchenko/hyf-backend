package com.example;

/*### Exercise 6.4 — Coding: Nested Loops — Multiplication Table

Print a formatted 5×5 multiplication table using nested loops:

```
     1    2    3    4    5
1    1    2    3    4    5
2    2    4    6    8   10
3    3    6    9   12   15
4    4    8   12   16   20
5    5   10   15   20   25
```

Requirements:

- Use `printf` with a fixed column width so numbers align correctly
- The header row and first column must be printed using the loop, not hardcoded */

public class Exercise6 {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print("");
            } else {
                System.out.print(i);
            }
            for (int j = 1; j <= 5; j++) {
                if (i == 0) {
                    System.out.print(j);
                } else {
                    System.out.print(i * j);
                }

            }
            System.out.println();

        }

    }

}
