package day5_reviewSecondWeek;

import java.util.Scanner;

public class Task {
    public static void main(String[] args){
        // Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız
        Scanner sc=new Scanner(System.in);
        System.out.println("3 Basamaklı BirSayı Giriniz");
        int sayi= sc.nextInt();


        int birler= sayi%10; //5
        System.out.println("birler = " + birler);

        int onlar= (sayi/10)%10;//3
        System.out.println("onlar = " + onlar);

        int yuzler=sayi/100; //4
        System.out.println("yuzler = " + yuzler);

        //534 oluşturacağız
        int yenisayi=birler*100+onlar*10+yuzler;
        System.out.println("yenisayi = " + yenisayi);

        //      Task 2
//        Kullanıcıdan bir sayı alın
//        sayı cift sayı mı olduğunu bir boolean değişkeni ile kontrol edin

    }
}
