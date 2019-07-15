package day4;

import java.util.Scanner;

/**
 * Day 4: Intro to Conditional Statements.
 *
 * <p>Link: {@link https://www.hackerrank.com/challenges/30-class-vs-instance/problem}
 *
 * <p>Task: Write a Person class with an instance variable, , and a constructor that takes an
 * integer, , as a parameter. The constructor must assign to after confirming the argument passed as
 * is not negative; if a negative argument is passed as , the constructor should set to and print
 * Age is not valid, setting age to 0.. In addition, you must write the following instance methods:
 *
 * <p>yearPasses() should increase the instance variable by . amIOld() should perform the following
 * conditional actions: If , print You are young.. If and , print You are a teenager.. Otherwise,
 * print You are old.. To help you learn by example and complete this challenge, much of the code is
 * provided for you, but you'll be writing everything in the future. The code that creates each
 * instance of your Person class is in the main method. Don't worry if you don't understand it all
 * quite yet!
 *
 * <p>Author: itesterok.
 */
public class Person {
  private int age;

  public Person(int initialAge) {
    this.age = initialAge;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int age = sc.nextInt();
      Person p = new Person(age);
      p.amIOld();
      for (int j = 0; j < 3; j++) {
        p.yearPasses();
      }
      p.amIOld();
      System.out.println();
    }
    sc.close();
  }

  public void amIOld() {
    // Write code determining if this person's age is old and print the correct statement:
    if (age < 0) {
      System.out.println("Age is not valid, setting age to 0.");
      age = 0;
    }
    if (age < 13) {
      System.out.println("You are young.");
    } else if (age >= 13 && age < 18) {
      System.out.println("You are a teenager.");
    } else {
      System.out.println("You are old.");
    }
  }

  public void yearPasses() {
    age++;
  }
}
