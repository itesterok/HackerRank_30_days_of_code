package day1;

import java.util.Scanner;

/**
 * Day 1: Data Types.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-data-types/problem}.
 *
 * <p>Task: Task Complete the code in the editor below. The variables , , and are already declared
 * and initialized for you. You must:
 *
 * <p>Declare variables: one of type int, one of type double, and one of type String. Read lines of
 * input from stdin (according to the sequence given in the Input Format section below) and
 * initialize your variables. Use the operator to perform the following operations: Print the sum of
 * plus your int variable on a new line. Print the sum of plus your double variable to a scale of
 * one decimal place on a new line. Concatenate with the string you read as input and print the
 * result on a new line.
 *
 * <p>Author: itesterok.
 */
public class Solution {

  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    /* Declare second integer, double, and String variables. */
    int i1 = Integer.parseInt(scan.nextLine());
    double d1 = Double.parseDouble(scan.nextLine());
    String s1 = scan.nextLine();
    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial
    // closely.

    /* Print the sum of both integer variables on a new line. */
    System.out.println(i + i1);
    /* Print the sum of the double variables on a new line. */
    System.out.println(d + d1);
    /* Concatenate and print the String variables on a new line;
    the 's' variable above should be printed first. */
    System.out.println(s + s1);
    scan.close();
  }
}
