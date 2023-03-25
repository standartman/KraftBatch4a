package day11_ControlFlowStatements;

import java.util.Scanner;

public class C04_If_ConsoldaYazim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ders notlarını giriniz");
        System.out.println("Fizik");
        double f= scan.nextDouble();
        System.out.println("Kimya");
        double k= scan.nextDouble();
        System.out.println("Geçme Notu:");
        double gecmeNotu= scan.nextDouble();
        double ort = (f+k)/2;
        boolean g=(ort>=70);
        if (ort>=gecmeNotu){
            System.out.println("Sınıfı geçtiniz tebrikler");
        }
    }
}
