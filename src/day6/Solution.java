package day6;

import java.util.Scanner;

/**
 * Day 6: Let's Review.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-review-loop/problem}
 *
 * <p>Task: Given a string, , of length that is indexed from to , print its even-indexed and
 * odd-indexed characters as space-separated strings on a single line (see the Sample below for more
 * detail).
 *
 * <p>Author: itesterok.
 */
public class Solution {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int i = 0;
    do {
      String evenString = "";
      String oddString = "";
      String string = s.next();

      for (int sym = 0; sym < string.length(); sym++) {
        if (sym % 2 == 0) {
          evenString += string.charAt(sym);
        } else {
          oddString += string.charAt(sym);
        }
      }
      System.out.println(evenString + " " + oddString);
      i++;
    } while (i < n);
  }
}
