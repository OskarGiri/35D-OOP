import java. util.Scanner;
public class Week2Task8 {
    public static void main(String[] args) {
    /* Take side of a square from user and print area and perimeter of it. 
    Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
    Scanner scan = new Scanner(System.in);
    System.out.println("Entry the side of square:");
    int side = scan.nextInt();
    
    System.out.println("Enter the length of triangle:");
    int length= scan.nextInt();

    System.out.println("Enter the breath of triangle:");
    int breath = scan.nextInt();

    System.out.println("Enter the amount for simple intrest:");
    int amount = scan.nextInt();

    System.out.println("Enter the time for simple intrest:");
    int time = scan.nextInt();

    System.out.println("Enter the rate simple intrest:");
    int rate= scan.nextInt();

    System.out.println("Entry the side of cube:");
    int sidecube = scan.nextInt();

    System.out.println("Enter the length of cubiode:");
    int length1= scan.nextInt();

    System.out.println("Enter the width of cubiode:");
    int width= scan.nextInt();

    System.out.println("Enter the height of cubiode :");
    int height= scan.nextInt();

    
    
    
    int area = side * side;
    int perimeter = 4*side;
    int areatriangle = length*breath;
    int simpleintrest = amount+time*rate/100;
    int volume = 3*sidecube;
    int cubiodevolume = length1*width*height;

    System.out.println("Area of square;" +area);
    System.err.println("Perimeter of Square;"+perimeter);
    System.out.println("Area of tringale;"+areatriangle);
    System.out.println("Simple interest;"+simpleintrest);
    System.out.println("Volume of cube;"+volume);
    System.out.println("Volume of cubiode;"+ cubiodevolume);
    

    scan .close();
    

    }
    
}
