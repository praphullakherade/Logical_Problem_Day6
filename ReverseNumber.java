package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number :" );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int reverse=0;
        while(num != 0){
            int remainder = num % 10;
            reverse= reverse * 10 + remainder;
            num /= 10;
        }
        System.out.println("Recersed Number: "+reverse);
    }
}
