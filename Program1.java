//Damarcus McGill
//MSC 501 x70
//Assignment 1 - Question 1 (Program1)
//10/20/20

import java.util.Scanner; //Scanner statement for input

public class Program1 {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in); //input statement

    System.out.print("Enter first integer: "); //1st prompt for user
    int number1 = input.nextInt(); //first integer

    System.out.print("Enter second integer: "); //2nd prompt for user
    int number2 = input.nextInt(); //second integer

    //sum, product, difference, and quoteint statements using user input values
    int sum = number1 + number2;
    int product = number1 * number2;
    int difference = number1 - number2;
    int quotient = number1/number2;

    // integers to string for print statements
    String num1 = Integer.toString(number1);
    String num2 = Integer.toString(number2);

    //print statements for sum, product, difference, and quotient
    System.out.println(num1 + " + " + num2 + " = " + sum);
    System.out.println(num1 + " * " + num2 + " = " + product);
    System.out.println(num1 + " - " + num2 + " = " + difference);
    System.out.println(num1 + " / " + num2 + " = " + quotient);



    }
}
