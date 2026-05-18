package com.temperature;

import java.util.Arrays;

/*### Exercise 4.3 — Coding: Temperature Analyser

Given the following array of daily temperatures:

```java
int[] temps = {14, 22, 9, 31, 17, 25, 8, 29, 11, 20};
```

Write a program that prints:

- The highest temperature
- The lowest temperature
- The average temperature (rounded to 2 decimal places)
- How many days were above 20°C

Expected output:

```
Highest : 31°C
Lowest  : 8°C
Average : 18.60°C
Above 20: 4 days
```

Requirements: do not use `Arrays.sort()` for min/max — write the logic yourself.

### Exercise 4.4 — Coding: Arrays Utility

Take the same `temps` array from Exercise 4.3. Using `java.util.Arrays`:

1. Print the array before sorting using `Arrays.toString()`
2. Sort it using `Arrays.sort()`
3. Print it again after sorting
4. Explain in one sentence what `Arrays.sort()` does to the original array — does it create a copy or modify in place?*/
public class TemperatureAnalizer {

    public static int getHighestTemperature(int[] temps) {
        int max = temps[0];
        for (int temp : temps) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static int getLowestTemperature(int[] temps) {
        int min = temps[0];
        for (int temp : temps) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public static double calculateAverage(int[] temps) {
        int sum = 0;
        for (int temp : temps) {
            sum += temp;
        }
        return (double) sum / temps.length;
    }

    public static int daysCounter(int[] temps, int treshhold) {
        int counter = 0;
        for (int temp : temps) {
            if (temp >= treshhold) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] temps = { 14, 22, 9, 31, 17, 25, 8, 29, 11, 20 };

        int highest = getHighestTemperature(temps);
        int lowest = getLowestTemperature(temps);
        double average = calculateAverage(temps);
        int counter = daysCounter(temps, 20);

        System.out.printf("Highest: %d%nLowest: %d%nAverage: %.2f%nAbove 20: %d", highest, lowest, average, counter);

        System.out.println(Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println(Arrays.toString(temps));


    }

}
