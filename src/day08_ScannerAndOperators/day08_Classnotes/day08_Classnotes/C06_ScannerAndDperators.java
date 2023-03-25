package day08_ScannerAndOperators.day08_Classnotes.day08_Classnotes;

import java.util.Scanner;

public class C06_ScannerAndDperators {
    public static void main(String[] args){
        //kulanıcıdan bir sayı alın
        //sayının karesini alın konsola yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int girilenSayi = scan.nextInt();
        System.out.println("Girilen Sayı= "+girilenSayi);
        System.out.println("Girilen Sayının karesi= "+girilenSayi*girilenSayi);
        scan.close();
    }
}
