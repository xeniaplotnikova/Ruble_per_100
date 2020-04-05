package com.company;

public class Main {

    public static void main(String[] args) {
        boolean one_hundred = true;
        int calculated_bonus = one_hundred ? 1 : 0;
        long amount = 150000;
        long bonus = amount * calculated_bonus / 100 / 100;
        System.out.println(bonus);
    }
}
