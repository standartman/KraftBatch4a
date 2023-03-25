package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C02_MaximumNumber {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        Scanner scan=new Scanner(System.in);
        for (int i=1; i<=5; i++ ){
            System.out.println("Enter a number : ");
            int num= scan.nextInt();
            if (num>max){
                max=num;
            }
        }
        System.out.println("Max= "+max);
    }
}
