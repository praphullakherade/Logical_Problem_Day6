package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int add = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                add += i;
            }
        }
        if (num == add) {
            System.out.println(num + " : is a perfect number");
        } else {
            System.out.println(num + " : is a not a perfect number");
        }
    }
}
