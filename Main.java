package com.company;

public class Main {

    public static void main(String[] args) {
        long amount = 150000;
        long bonus = amount / 100 / 100;
        System.out.println(bonus);
        if (amount < 100000) {
            bonus = 0;
        }
    }


}