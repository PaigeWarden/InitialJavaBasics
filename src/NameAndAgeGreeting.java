import java.util.Scanner;
public class NameAndAgeGreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = reader.nextLine();
        // Reads a line from the users keyboard

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());
        //Reads a string variable from keyboard and transfers it to an Interger

        System.out.println("Your name is: " +name +" and you are " +age + " years old, nice to meet you!");
    }

}
