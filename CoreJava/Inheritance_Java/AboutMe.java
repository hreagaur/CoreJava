package Inheritance_Java;

import java.util.Scanner;

class AboutMe {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Employee name, age and salary:");

    String name = sc.nextLine();

    int age = sc.nextInt();

    double salary = sc.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
    sc.close();
  }
}
