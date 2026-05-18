
package com.example;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("hey i need your data. first name");
        String name = s.nextLine();
        System.out.println("now enter age");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("your city please");
        String city = s.nextLine();
        System.out.println("Hourly rate in euros");
        double rate = s.nextDouble();
        s.nextLine();
        System.out.println("now hours");
        int hours = s.nextInt();
        double mouthlyPay = rate * hours;

        s.close();

        System.out.printf(
                "PERSONAL PROFILE CARD%nName : %s%nAge : %d%nCity: %s%nRate: €%.2f  / hr%nHours : %d hrs%nMonthly pay: €%.2f%n",
                name, age, city, rate, hours, mouthlyPay);

    }
}
