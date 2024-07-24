package Oops.Encapsulation;

import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = sc.nextLine();
    System.out.println("Username is: " + userName);
    sc.close();
  }
}

