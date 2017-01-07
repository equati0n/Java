/*
 * Author: Jonathan Baird
 * Purpose: Test boolean operators
 * Date: 1/7/17
 */
import java.util.Scanner; 

public class TestBooleanOperators {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 2 == 0 && number % 3 == 0)
      System.out.println(number + " is divisible by 2 and 3.");

    if (number % 2 == 0 || number % 3 == 0)
      System.out.println(number + " is divisible by 2 or 3.");
    
    //exclusive or (^) of two Boolean operands is true if 
    //and only if the two operands have different Boolean values
    if (number % 2 == 0 ^ number % 3 == 0)
      System.out.println(number + 
        " divisible by 2 or 3, but not both.");
  }
}
