package day3;

import java.util.*;

/**
 * Day 3: Intro to Conditional Statements.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-conditional-statements/problem
 *
 * <p>Task: Given an integer, , perform the following conditional actions:
 *
 * If  is odd, print Weird
 * If  is even and in the inclusive range of  to , print Not Weird
 * If  is even and in the inclusive range of  to , print Weird
 * If  is even and greater than , print Not Weird
 * Complete the stub code provided in your editor to print whether or not  is weird.
 *
 * <p>Author: itesterok.
 */

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    String ans="";

    // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
    if(n%2!=0){
      ans = "Weird";
    }
    // If  is even and in the inclusive range of 2 to 5, print Not Weird
    else if (n>=2 && n<=5) {
      ans = "Not Weird";
    }
    // If  is even and in the inclusive range of 6 to 20, print Weird
    else if (n>=6 && n<=20) {
      ans = "Weird";
    }
    // If  is even and greater than 20, print Not Weird
    else if (n>20) {
      ans = "Not Weird";
    }
    System.out.println(ans);
  }
}
