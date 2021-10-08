package com.company;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        System.out.print("Press any number to Start :");
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        sc.nextFloat();

        System.out.print("Press any number to End :");
        long end = System.currentTimeMillis();
        sc.nextFloat();
        sc.close();

        long elapsedTime = (end - start) / 1000;
        System.out.println("Time difference between start and end time: " + elapsedTime);
    }
}
