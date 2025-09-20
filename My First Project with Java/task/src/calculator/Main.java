package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        prices();
        totalIncome();
        expenses();
    }

    static double total;

    static void prices() {
        System.out.println("Prices:");
        System.out.println("Bubblegum: $2");
        System.out.println("Toffee: $0.2");
        System.out.println("Ice cream: $5");
        System.out.println("Milk chocolate: $4");
        System.out.println("Doughnut: $2.5");
        System.out.println("Pancake: $3.2");
        System.out.println();
    }

    static void totalIncome() {
        int earnedBubblegum = 202;
        int earnedToffee = 118;
        int earnedIcecream = 2250;
        int earnedMilkchocolate = 1680;
        int earnedDoughnut = 1075;
        int earnedPancake = 80;
        total = earnedBubblegum + earnedToffee +  earnedIcecream + earnedMilkchocolate + earnedDoughnut + earnedPancake;
        System.out.println("Earned:");
        System.out.println("Bubblegum: $" + earnedBubblegum);
        System.out.println("Toffee: $" + earnedToffee);
        System.out.println("Ice cream: $" + earnedIcecream);
        System.out.println("Milk chocolate: $" + earnedMilkchocolate);
        System.out.println("Doughnut: $" +  earnedDoughnut);
        System.out.println("Pancake: $" + earnedPancake);
        System.out.println("Income: $" + total);
        System.out.println();
    }

    static void expenses() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        System.out.println("Net income: $" + (total - staffExpenses - otherExpenses));
    }
}