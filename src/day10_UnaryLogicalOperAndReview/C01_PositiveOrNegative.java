package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C01_PositiveOrNegative {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        /*System.out.println("Lütfen bir sayı giriniz: ");
        int number=scan.nextInt();
        boolean isP= number > 0;
        boolean isN= number < 0;
        boolean isZ= number ==0;

        System.out.println(number+" is positive number: "+isP);
        System.out.println(number+" is negative number: "+isN);
        System.out.println(number+" is zero number: "+isZ);*/

        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int number1= scan.nextInt();

        boolean u1=number1<8;
        boolean u2=number1>=9;
        boolean u3=number1==7;
        System.out.println("u1 = " + u1);
        System.out.println("u2 = " + u2);
        System.out.println("u3 = " + u3);


    }
}

/*
1. Create a class called C01_PositiveAndNegative, and  write a program that can identify if the user entered number is
    positive, or negative or zero.

            Ex:
                number = 200*/
