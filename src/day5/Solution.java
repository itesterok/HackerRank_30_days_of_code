package day5;

import java.util.Scanner;

/**
 * Day 5: Loops.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-loops/problem}
 *
 * <p>Task: Given an integer, , print its first multiples. Each multiple (where ) should be printed
 * on a new line in the form: n x i = result.
 *
 * <p>Author: itesterok.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(String.format("%s x %s = %s ", n, i, n * i));
    }
  }
}
