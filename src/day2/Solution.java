package day2;

import java.util.Scanner;

/**
 * Day 2: Operators.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-operators/problem}
 *
 * <p>Task: Given the meal price (base cost of a meal), tip percent (the percentage of the meal
 * price being added as tip), and tax percent (the percentage of the meal price being added as tax)
 * for a meal, find and print the meal's total cost.
 *
 * <p>Author: itesterok.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double mealCost = scan.nextDouble(); // original meal price
    int tipPercent = scan.nextInt(); // tip percentage
    int taxPercent = scan.nextInt(); // tax percentage
    scan.close();

    // Write your calculation code here.
    double totalPrice =
        mealCost + mealCost * ((double) tipPercent / 100 + (double) taxPercent / 100);
    // cast the result of the rounding operation to an int and save it as totalCost
    int totalCost = (int) Math.round(totalPrice);

    // Print your result
    System.out.println("The total meal cost is " + totalCost + " dollars.");
  }
}
