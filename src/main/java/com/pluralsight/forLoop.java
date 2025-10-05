package com.pluralsight;

public class forLoop {
    public static void main(String[] args)throws InterruptedException {
        for (int i = 10; i >= 1; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }

        System.out.println("Launch!");
    }
}
