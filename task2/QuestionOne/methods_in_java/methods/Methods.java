package QuestionOne.methods_in_java.methods;

import java.util.Scanner; //Scanner import

public class Methods {

    // main method
    public static void main(String[] args) {

        // a list of my variables
        double first_num, second_num, third_num, smallnum, largenum;

        // scanner object
        Scanner input = new Scanner(System.in);

        // getting input
        System.out.println("\nEnter the first number: ");
        first_num = input.nextInt(); // input first number
        System.out.println("Enter the second number: ");
        second_num = input.nextInt(); // input second number
        System.out.println("Enter the third number: ");
        third_num = input.nextInt(); // input third number

        // get return values fom the methods
        smallnum = smallNumber(first_num, second_num, third_num);
        largenum = largeNumber(first_num, second_num, third_num);

        // output
        System.out.println("\nThe smallest number: " + smallnum);
        System.out.println("The largest number: " + largenum);
        System.out.println(largenum + " is your largest and " + smallnum + " is the smallest number.");
    }

    // this method will return the smallest num
    static double smallNumber(double num_1, double num_2, double num_3) {

        if (num_1 < num_2) {
            // if true, is num_1 > num_3
            if (num_1 < num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            // else false, is num_2 < num_3
            if (num_2 < num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // this method will return the largest num
    static double largeNumber(double num_1, double num_2, double num_3) {

        // get largest number
        if (num_1 > num_2) {
            if (num_1 > num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 > num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

}
