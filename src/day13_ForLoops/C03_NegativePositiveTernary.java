package day13_ForLoops;

import java.util.Scanner;

public class C03_NegativePositiveTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int n= scan.nextInt();

        if (n>0){
            System.out.println("positive number");
        } else if (n<0) {
            System.out.println("negativi number");
        }else{
            System.out.println("zero");
        }
        System.out.println("------------");


    }
}
