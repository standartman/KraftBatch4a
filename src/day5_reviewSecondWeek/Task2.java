package day5_reviewSecondWeek;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        //        Task 2
        //        Kullanıcıdan bir sayı alın
        //        sayı cift sayı mı olduğunu bir boolean değişkeni ile kontrol edin
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz: ");
        int sayi= sc.nextInt();
        boolean ciftMi=(sayi%2==0);
        System.out.println("ciftMi = " + ciftMi);


    }
}
