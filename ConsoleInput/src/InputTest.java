/*
 * Author: Jonathan Baird
 * Purpose: Test Console Input in Java
 * Date: 12/27/2016
 */

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		//This is a book example, but input has error line
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius " +
				 radius + " is " + area);

	}

}
