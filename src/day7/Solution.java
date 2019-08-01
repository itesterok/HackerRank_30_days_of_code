package day7;

import java.util.Scanner;

/**
 * Day 7: Arrays.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-arrays/problem}
 *
 * <p>Given an array, , of integers, print 's elements in reverse order as a single line of
 * space-separated numbers.
 *
 * <p>Author: itesterok.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    in.close();
    for (int i = n - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}
