public class CircleCalculator {
    //This creates a java class called CircleCalculator
    public static void main(String[] args) {

        double circleRadius = 12.0;
        double circleDiameter = circleRadius*2;
        // diameter is the radius multiplied by 2
        double circleCircumference = (circleRadius * 3.14) *2;
        // the circumference of the circle
        double circleArea = 3.14 * (circleRadius * circleRadius);
// the area of the circle

        System.out.println("The radius of the circle is " +circleRadius);
        // the output for the radius of the circle
        System.out.println("The diameter of the circle is " + circleDiameter) ;
        // the output for the diameter of the circle
        System.out.println("The circumference of the circle is " + circleCircumference) ;
        // output for the circumference
        System.out.println("The area of the circle is " + circleArea);
        //output for the area

        // double variable for circleRadius
    }
}
