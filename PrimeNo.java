package com.company;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        boolean flag = false;
        for (int i=2; i<=num/2; ++i){
            if (num % i ==0){
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + ": is a Prime Number");
        }else{
            System.out.println(num+ ": is a not Prime Number");
        }
    }
}
