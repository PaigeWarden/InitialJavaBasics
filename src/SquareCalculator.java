import java.util.Scanner;
//added a scanner into the file
public class SquareCalculator {
    // This creates a new java class for this code
    public static void main(String[] args) {
// This creates a main
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your width? ");
       double width = Double.parseDouble(reader.nextLine());
        System.out.println("What is your height? ");
        double height = Double.parseDouble(reader.nextLine());

        double perimeter = (width + height)*2;
        double area = (width * height);
        // this creates double variables for my code

        System.out.println("The width is " + width + "cm.");
        System.out.println("The height is " + height + "cm.");
        System.out.println("The perimeter is "+ perimeter +"cm.");
        System.out.println("The area is " + area +"cm^2.");
        // These output the code to the system.
    }
}
