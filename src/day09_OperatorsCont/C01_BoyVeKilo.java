package day09_OperatorsCont;

import java.util.Scanner;

public class C01_BoyVeKilo {
    //kullanıcıdan boy (ondalıklı) ve kilosunu (ondalıklı) bilgisini alıp ekrana tek satırda yazdırınız
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz : ");
        double boy= sc.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo= sc.nextDouble();
        sc.nextLine();
        System.out.print("Lüten isminizi giriniz: ");
        String isim= sc.nextLine();

        System.out.print("soyisim ");
        String soyisim= sc.nextLine();

        System.out.println(isim+" "+ soyisim +" boyunuz "+boy+" m kilonuz "+kilo+" kg ");
        //sc.nextline ile sc.next farkı var. next sadece boşluğa kadar olan yeri alır
        //nextline ise entere kadar olan yeri

    }

}
