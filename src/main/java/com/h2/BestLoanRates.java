package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of(
            1, 5.50f,
            2, 3.45f,
            3, 2.67f
    );

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scanner = new Scanner (System.in);
=======
        Scanner scanner = new Scanner(System.in);
>>>>>>> origin/module5-solution
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter the loan term (in years)");
<<<<<<< HEAD
        int loanTermsInYears = scanner.nextInt();
        float bestRate = getRates(loanTermsInYears);
        if(bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermsInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + getRates(loanTermsInYears) + "%");
        }
    }

    public static float getRates(int loanTermsInYears) {
        if(bestRates.containsKey(loanTermsInYears)) {
            return bestRates.get(loanTermsInYears);
=======
        int loanTermInYears = scanner.nextInt();
        float bestRate = getRates(loanTermInYears);
        if(bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        } else {
            System.out.println("Best Available Rate: " + bestRate + "%");
        }
    }

    public static float getRates(int loanTermInYears) {
        if(bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
>>>>>>> origin/module5-solution
        }
        return 0.0f;
    }
}
