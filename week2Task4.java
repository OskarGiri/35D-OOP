import java.util.Scanner;

public class week2Task4 {
    public static void main(String[] args) {
        /*  Write the ternary operator for question no. 1*/
Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the age of a person: ");
        int age1 = scan1.nextInt();
        scan1.close();

        String eligibilityStatus = (age1 > 18) ? "eligible" : "not eligible";
        System.out.println("You are " + eligibilityStatus + " to vote.");
      
    }
}
