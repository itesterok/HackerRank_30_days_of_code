package day9;

import java.util.Scanner;

/**
 * Day 9: Recursion 3.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-recursion/problem}
 *
 * <p>Write a factorial function that takes a positive integer, as a parameter and prints the result
 * of ( factorial).
 *
 * <p>Author: itesterok.
 */
public class Solution {

  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    System.out.println(factorial(n));
  }

  private static int factorial(int nn) {
    return nn <= 1 ? 1 : nn * factorial(nn - 1);
  }
}
