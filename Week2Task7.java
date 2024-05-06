import java.util.Scanner;
public class Week2Task7 {
    public static void main(String[] args) {
        /*7. Take the name, roll number, and field of interest 
        from the user and print in the format below:
         Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
         * 
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name ;");
        String name = scan.nextLine();

        System.out.println("Enter your roll number ;");
        String rollNumber = scan.nextLine();

        System.out.println("Enter your field of interest;");
        String FieldofInerest= scan.nextLine();

        System.out.println("Hey, my name is"+name+"and my roll number is"+rollNumber+".");
        System.out.println("My field of interest are"+FieldofInerest);
        scan.close();
        

        


    }

    
}
