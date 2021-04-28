package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {
    private float[] credits;
    private float[] debits;

<<<<<<< HEAD
    public SavingsCalculator (float[] credits, float[] debits) {
=======
    public SavingsCalculator(float[] credits, float[] debits) {
>>>>>>> origin/module5-solution
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits() {
        float sum = 0.0f;
        for(float credit: credits) {
            sum += credit;
        }
        return sum;
    }

    private float sumOfDebits() {
        float sum = 0.0f;
        for(float debit: debits) {
            sum += debit;
        }
        return sum;
    }

    private static int remainingDaysInMonth(LocalDate date) {
<<<<<<< HEAD
       YearMonth yearsMonth = YearMonth.of(date.getYear(), date.getMonth());
       int totalDaysInMonth = yearsMonth.lengthOfMonth();
       int remainingDays =totalDaysInMonth - date.getDayOfMonth();
       return remainingDays;
=======
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainingDays = totalDaysInMonth - date.getDayOfMonth();
        return remainingDays;
>>>>>>> origin/module5-solution
    }

    public float calculate() {
        return sumOfCredits() - sumOfDebits();
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        final String[] creditsAsString = args [0].split(",");
        final String[] debitsAsString = args [1].split(",");
=======
        final String[] creditsAsString = args[0].split(",");
        final String[] debitsAsString = args[1].split(",");
>>>>>>> origin/module5-solution

        final float[] credits = new float[creditsAsString.length];
        final float[] debits = new float[debitsAsString.length];

<<<<<<< HEAD
        for(int i = 0; i < creditsAsString.length; i++) {
            credits[i] = Float.parseFloat(creditsAsString[i]);
        }

        for(int i = 0; i < debitsAsString.length; i++){
=======
        for (int i = 0; i < creditsAsString.length; i++) {
            credits[i] = Float.parseFloat(creditsAsString[i]);
        }

        for (int i = 0; i < debitsAsString.length; i++) {
>>>>>>> origin/module5-solution
            debits[i] = Float.parseFloat(debitsAsString[i]);
        }

        final SavingsCalculator calculator = new SavingsCalculator(credits, debits);
        float netSavings = calculator.calculate();
        System.out.println("Net Savings = " + netSavings + ", remaining days in month = " + remainingDaysInMonth(LocalDate.now()));
<<<<<<< HEAD

    }

=======
    }
>>>>>>> origin/module5-solution
}
