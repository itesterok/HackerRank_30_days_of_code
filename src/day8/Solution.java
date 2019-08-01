package day8;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Day 8: Dictionaries and Maps.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem}
 *
 * <p>Given names and phone numbers, assemble a phone book that maps friends' names to their
 * respective phone numbers. You will then be given an unknown number of names to query your phone
 * book for. For each queried, print the associated entry from your phone book on a new line in the
 * form name=phoneNumber; if an entry for is not found, print Not found instead.
 *
 * <p>Author: itesterok.
 */
public class Solution {
  private static HashMap<String, Integer> tb = new HashMap<>();

  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      String name = in.next();
      int phone = in.nextInt();
      tb.put(name, phone);
    }
    while (in.hasNext()) {
      String s = in.next();
      if (tb.containsKey(s)) {
        System.out.println(String.format("%s=%s", s, tb.get(s)));
      } else {
        System.out.println("Not found");
      }
    }
    in.close();
  }
}
