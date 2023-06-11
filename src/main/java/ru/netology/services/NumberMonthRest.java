package ru.netology.services;

public class NumberMonthRest {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int currentBalance = 0;
        for (int mounth = 0; mounth < 12; mounth++) {

            if (currentBalance <= threshold) {
                currentBalance = currentBalance + income;
                currentBalance = currentBalance - expenses;
            } else {
                currentBalance = currentBalance - expenses;
                currentBalance = currentBalance / 3;
                count++;

            }
        }
        return count;
    }

}
