public class Week2task9 {
   // To calculate the total marks of four subjects of a student and the total percentage secured, and use the following conditions to generate the final result, you can use the following code:
    public static void main(String[] args) {
        int sub1 = 70;
        int sub2 = 60; 
        int sub3 = 50; 
        int sub4 = 40; 
        int totalMarks = sub1 + sub2 + sub3 + sub4;
        double percentage = (totalMarks * 100) / 400.0;
        String result = (percentage >= 70)? "First Class" : (percentage > 59)? "Upper Second Class" : (percentage > 49)? "Second Class" : (percentage >= 39)? "Third Class" : "Fail";
        System.out.println("Total Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}
    

