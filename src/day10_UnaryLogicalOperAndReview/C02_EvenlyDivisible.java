package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
       /*
* 2. Create a class called C01_EvenlyDivisible,and write a program that gets an integer number from user
 check if a number is evenly divisible by 2, 3, 5
                Ex:
                number = 65;*/
        System.out.println("Enter an integer number :");

        int number= scan.nextInt();

        boolean isDisivibleBy2= number%2==0;
        boolean isDisivibleBy3= number%3==0;
        boolean isDisivibleBy5= number%5==0;
        System.out.println(number+" is divisible by 2: "+isDisivibleBy2);
        System.out.println(number+" is divisible by 3: "+isDisivibleBy3);
        System.out.println(number+" is divisible by 5: "+isDisivibleBy5);




    }
}

