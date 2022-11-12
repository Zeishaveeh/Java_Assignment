package task1;

import java.util.Scanner; //importing Scanner 

public class QuestionOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //My scanner object
        
        //variables
        String srName, oddEven;
        int age, numberOfChar;
        
        System.out.println("Please enter your surname :");
        srName = input.nextLine(); //getting name
        System.out.println("PLease enter your age :");
        age = input.nextInt(); //getting age

        numberOfChar = srName.length();
        //if age is even or odd
        if (age % 2 == 0) {
            oddEven = "even";
            //Display output
        System.out.println("The number of letters in your surname is : " + numberOfChar);
        System.out.println("Your current age is an " + oddEven + " number.");
        } else {
            oddEven = "odd";
            //Display output
        System.out.println("The number of letters in your surname is : " + numberOfChar);
        System.out.println("Your current age is an " + oddEven + " number.");
        }
    }
}