import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Creating variables and Scanner object
        int massInKg;
        double index, height;
        Scanner input = new Scanner(System.in);

        //Prompt user to get values for relevant variables
        System.out.print("Enter your mass in kg: ");
        massInKg = input.nextInt();

        System.out.println("Enter your height in meters: ");
        height = input.nextDouble();

        index = massInKg / (height * height);
        System.out.println("Your body mass index is: " + index);
    }
}
