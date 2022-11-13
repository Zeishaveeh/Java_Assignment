package QuestionTwo;

import java.util.Scanner;

public class GenerateAverage {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        double java, networking, forMath, average; // my variables

        // input marks
        System.out.println("Enter marks for Java Programming: ");
        java = input.nextInt(); // get java marks
        System.out.println("Enter marks for Networking: ");
        networking = input.nextInt(); // get networking marks
        System.out.println("Enter marks for Maths: ");
        forMath = input.nextInt(); // get maths marks

        // output
        System.out.println("\nMarks for Java Programming is: " + java);
        System.out.println("Marks for Networking: " + networking);
        System.out.println("Marks for Maths: " + forMath);

        // compute the average
        average = (java + networking + forMath) / 3;

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
