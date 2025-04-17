package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int luckyTickets = Exercise.Calculate();
        System.out.println("The number of lucky streetcar tickets: " + luckyTickets);
    }
}

