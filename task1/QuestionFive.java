package task1;

import java.util.Scanner; //importing Scanner

public class QuestionFive {

    //method for calculations
    static void calculations(double num1, double num2, char operatorSymbol) {
      
        // variable for my result
        Double result;

        switch (operatorSymbol) {

            //subtraction
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;

            //addition
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;

            //multiplication
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;

            //division
            case '/':
                result = num1 / num2;
                System.out.println("The result is: " + result);
                break;

            default:
                System.out.println("Please try again.");
                break;
        }
    }

    //main method
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in); // Scanner object

        

        
        System.out.println("Enter the first number");
        Double num1;
        num1 = data.nextDouble(); //getting first number

        // request the the operatorSymbol from the user
        System.out.println("Enter your operator (+, -, *, /): ");
        char operatorSymbol;
        operatorSymbol = data.next().charAt(0); //getting the operator


        // request the second number from the user
        System.out.println("Enter second number");
        Double num2;
        num2 = data.nextDouble(); //getting second number

        calculations(num1, num2, operatorSymbol);
    }
}
