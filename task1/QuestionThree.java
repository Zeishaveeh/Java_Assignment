package task1;

import java.util.Scanner; //Sannner import

public class QuestionThree {
    
    //this method does the test for 0
    static void isNumDivBy0(int numEntered) {
        System.out.println(numEntered + " cannot be divisible by 0.");
    }

    //this method does the test for 1
    static void isNumDivBy1(int numEntered) {
        System.out.println(numEntered + " is divisible by 1.");
    }

    //this method does the test for 2
    static void isNumDivBy2(int numEntered) {
        if (numEntered % 2 == 0) {
            System.out.println(numEntered + " is divisible by 2.");
        } else {
            System.out.println(numEntered + " is not divisible by 2.");
        }
    }

    //this method does the test for 3
    static void isNumDivBy3(int numEntered) {
        if ((numEntered % 3) == 0) {
            System.out.println(numEntered + " is divisible by 3");
        } else {
            System.out.println(numEntered + " is not divisible by 3");
        }
    }

    //this method does the test for 4
    static void isNumDivBy4(int numEntered) {
        if ((numEntered % 4) == 0) {
            System.out.println(numEntered + " is divisible by 4");
        } else {
            System.out.println(numEntered + " is not divisible by 4");
        }
    }

    //this method does the test for 5
    static void isNumDivBy5(int numEntered) {
    if ((numEntered % 5) == 0) {
            System.out.println(numEntered + " is divisible by 5");
        } else {
            System.out.println(numEntered + " is not divisible by 5");
        }
    }

    //this method does the test for 6
    static void isNumDivBy6(int numEntered) {
        if ((numEntered % 6) == 0) {
            System.out.println(numEntered + " is divisible by 6");
        } else {
            System.out.println(numEntered + " is not divisible by 6");
        }
    }

    //this method does the test for 7
    static void isNumDivBy7(int numEntered) {
        if ((numEntered % 7) == 0) {
            System.out.println(numEntered + " is divisible by 7");
        } else {
            System.out.println(numEntered + " is not divisible by 7");
        }
    }

    //this method does the test for 8
    static void isNumDivBy8(int numEntered) {
        if ((numEntered % 8) == 0) {
            System.out.println(numEntered + " is divisible by 8");
        } else {
            System.out.println(numEntered + " is not divisible by 8");
        }
    }

    //this method does the test for 9
    static void isNumDivBy9(int numEntered) {
        if ((numEntered % 9) == 0) {
            System.out.println(numEntered + " is divisible by 9");
        } else {
            System.out.println(numEntered + " is not divisible by 9");
        }
    }


    //the main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);


        int numToTest;
        //getting input
        System.out.println("This program checks if numbers are divisibile by zero to 9. Enter any number :");        
        numToTest = input.nextInt();

        //calling the methods shown above
        isNumDivBy0(numToTest);
        isNumDivBy1(numToTest);
        isNumDivBy2(numToTest);
        isNumDivBy3(numToTest);
        isNumDivBy4(numToTest);
        isNumDivBy5(numToTest);
        isNumDivBy6(numToTest);
        isNumDivBy7(numToTest);
        isNumDivBy8(numToTest);
        isNumDivBy9(numToTest);
    }

}
