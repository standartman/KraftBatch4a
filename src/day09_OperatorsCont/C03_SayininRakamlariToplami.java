package day09_OperatorsCont;

import java.util.Scanner;

public class C03_SayininRakamlariToplami {
    public static void main(String[] args){
        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin (totalOfDigits)


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir sayı giriniz");

        int number= scan.nextInt(); //ekrana 142 yazarsa   -->1+4+2=7
        int lastDigit= number%10;   //lastDigit=2
        int totalOfDigits= lastDigit;
        number=number/10; //14
        lastDigit=number%10;   //4
        totalOfDigits=totalOfDigits+lastDigit;//2+4=6

        number=number/10; //14/10=1
        lastDigit=number%10; //1
        totalOfDigits=totalOfDigits+lastDigit;  //6+1=7

        System.out.println("Girilen Sayinin Rakamlar Toplami "+totalOfDigits);
        System.out.println("---------------");











    }
}
