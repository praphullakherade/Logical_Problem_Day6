package com.company;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        System.out.println("Enter Fibonacci Series Length:");
        Scanner fibonacci=new Scanner(System.in);
        int length=fibonacci.nextInt();
        fibonacci.close();

        int[] num = new int [length];
        num[0]=0;
        num[1]=1;

        for (int i=2; i < length; i++){
            num[i] = num[i-1] + num[i-2];
        }

        System.out.println("Fibonacci Series: ");
        for (int i=0; i<length; i++){
            System.out.println(num[i] + " ");
        }
    }
}
