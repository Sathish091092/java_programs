package Demo;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side");
         int side1= sc.nextInt();
        System.out.println("Enter the second side");
        int side2= sc.nextInt();
        System.out.println("Enter the third side");
        int side3= sc.nextInt();
        if (side1==side2 && side1==side3 && side3==side2){
            System.out.println("it is a triangle");

        }else if (side1 == side2 || side2== side3 || side1 == side3) {
            System.out.println("triangle is isosceles");
        } else  {
            System.out.println("triangle is scalene");
        }
sc.close();
    }
}
