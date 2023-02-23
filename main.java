package com.test2;

import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Get Ready");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("3");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("2");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("1");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }

        double start_time= LocalTime.now().toNanoOfDay();
        System.out.println("GOOOOOO");
        System.out.println();

        System.out.print("Start Typing : ");
        Scanner sc =new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println();

        double finish_time=LocalTime.now().toNanoOfDay();
        double check= finish_time -start_time;
        double sec = check/Math.pow(10,9);
        int chars = text.length();
        int wpm=(int)(((double)chars/sec)*60);
        System.out.println("You can type "+wpm+" words per minute.");
        System.out.println("Nice!");

    }
}

