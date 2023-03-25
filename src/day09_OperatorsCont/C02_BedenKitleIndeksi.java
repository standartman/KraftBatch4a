package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleIndeksi {
    public static void main(String[] args){

        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.
        Beden Kitle İndeksi : Kilo / (Boy(m) * Boy(m)) */

        Scanner scan=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz: ");
        int kilo=  scan.nextInt();
        System.out.print("Boyunuzu giriniz (ornek:1.80): ");
        double boy=scan.nextDouble();

        double bki=kilo/(boy*boy);
        System.out.print(" Kilonuz: "+kilo);
        System.out.print(" Boyunuz: "+boy);
        System.out.print(" Beden Kitle İndeksi : "+bki);
        //import java.util.Scanner; bu sınıf önemli bir sınıf. zaten bunun üstünde çalışıyoruz şu anda.

    }
}
