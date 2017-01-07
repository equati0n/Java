/*
 * Author:Jonathan Baird
 * Purpose: Simple if demo of if statement and modulus
 * Date: 1/6/17
 */
import java.util.Scanner;

 public class SimpleIfDemo {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter an integer: ");
 int number = input.nextInt();

//If the remainder of the number divided by 5 is 0
 if (number % 5 == 0)
 System.out.println("HiFive");

 // If the remainder of the number divided by 2 is 0
 if (number % 2 == 0)
 System.out.println("HiEven");
 }
 }
