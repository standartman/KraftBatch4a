package myWorkAgain;

import java.util.Scanner;

public class PatikaIfElseKonusu {
    public static void main(String[] args) {

        /* int a = 34, b = 36, c=1;
        if ((a<b)&&(a<c)){
            System.out.println("a en küçüktür");
        } else if ((b<a)&&(b<c)) {
            System.out.println("b en küçüktür");
        }else if(c<a||c>b){
            System.out.println("c en küçüktür");
        }else {
            System.out.println("c en küçük");
        }*/
        Scanner scan= new Scanner(System.in);
        System.out.print( " sayı giriniz ");
        int a= scan.nextInt();
        System.out.print( " sayı giriniz ");
        int b= scan.nextInt();
        System.out.print( " sayı giriniz ");
        int c= scan.nextInt();
        if((a<b)&&!(a<c)){
            System.out.println("a en küçük");
        } else if ((b<a)&&(b<c)) {
            System.out.println("b en küçük");
        } else if ((c<a)&&(c<b)) {
            System.out.println("c kardeşiniz. sevin onu ");
        }else {
            System.out.println("nerde lan bu sayı");
        }


    }

    }



