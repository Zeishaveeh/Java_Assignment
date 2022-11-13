package QuestionThree.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class TriangleArea {

    static double baseOfTriangle, heightOfTriangle, area;

    // main method
    public static void main(String[] args) {

        // calling the non-static methods
        TriangleArea classObject = new TriangleArea();
        classObject.inputMearsurements();
        classObject.findArea();
        classObject.outputResults();
    }

    // input the baseOfTriangle and the heightOfTriangle
    void inputMearsurements() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base measurement of the triangle: ");
        baseOfTriangle = input.nextDouble(); // store the input in baseOfTriangle
        System.out.println("Enter the height measurement of the triangle: ");
        heightOfTriangle = input.nextDouble(); // store the input in heightOfTriangle
    }

    // find the area of the rectangle
    void findArea() {
        area = 0.5 * baseOfTriangle * heightOfTriangle;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area of the triangle is: " + area);
    }
}
