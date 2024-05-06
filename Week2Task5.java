import java.util.Scanner;
public class Week2Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System .in);
     /*  Write a program to take two integer inputs from the user and print the sum and product of them. */
     System.out.println("Enter the  of integer :");
     int num1 = scan.nextInt();
     System.out.println("Enter the second integer;");
     int num2 = scan.nextInt();
     
     int sum = num1 +num2;
     int product= num1*num2;
     System.out.println("Sum" +sum);
     System.out.println("Product" +product);
     /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result. */
     double division = (double) sum/product;
     System.out.println("Division" +division);  
     scan .close();



    }
    
}
