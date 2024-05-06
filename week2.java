import java.util.Scanner;
public class week2 {

    public static void main(String[] args) {
        // Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        System.out.println("Enter the age of a person");
        Scanner scan = new Scanner(System .in);
        int age = scan.nextInt();
        if( age>18){
            System.err.println("you can  vote");
        } else {
            System.out.println("you can not vote");
            scan.close();
        }
        
      /*   2. Write a program to calculate SI. 

Formula Simple Interest = (PrincipleAmount*Time*Rate/100);*/
int amount=12,time=120,rate=12;
System.out.println("The simple interst is" + (amount+time*rate/100));
/* Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
int length = 16,Breath = 12;
    System.out.println("The area of rectangle is " +(length*Breath));

int l = 16, W= 12, h=22 ;
    System.out.println("The volume  of cuboid  is " +(l*W*h));
 int l1 = 16, l2= 2, l3=25 ;
    System.out.println("The volume  of cube  is " +(l1*l2*l3));

        
    }
}