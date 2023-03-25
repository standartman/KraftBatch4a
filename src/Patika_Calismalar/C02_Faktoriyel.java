package Patika_Calismalar;

import java.util.Scanner;

public class C02_Faktoriyel {
    public static void main(String[] args) {
        //n! = 1*2*3*4*,,,,*n
        Scanner scan=new Scanner(System.in);
        System.out.print("sayı giriniz = ");
        int n= scan.nextInt();
        int total=1;
        for(int i=1; i<=n; i++){
            total=total*i;
        }
        System.out.println(n+ " faktöriyel = "+total);
    }
}
