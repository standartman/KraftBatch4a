package Patika_Calismalar;

import java.util.Scanner;

public class C03_Uslu_Sayi_Hesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı : ");
        int n= scan.nextInt(); // mesela bu sayı 3
        System.out.println("Üs olacak sayı : ");
        int k= scan.nextInt(); //mesela bu sayı üst yani üstte olacak 3
        int total =1;

        int i=1;
        while (i <= k) {
            total=total*n;
            i++;
        }
        System.out.println(total);


    }
}
