package Demo;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int input= sc.nextInt();

        if(input%3==0 && input%5==0){
            System.out.println("fizzbuzz");
        }else
            if(input%3==0){
                System.out.println("fizz");
            }else if(input%5==0){
            System.out.println("buzz");
        }
    }
}
