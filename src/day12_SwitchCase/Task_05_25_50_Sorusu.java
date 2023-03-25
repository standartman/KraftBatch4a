package day12_SwitchCase;

import java.util.Scanner;

public class Task_05_25_50_Sorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz : ");
        int sayi= scan.nextInt();
        if(sayi>5) {
            System.out.println("girdiğiniz sayı beşten büyük mü? Evet / Hayır ");
        }String answer= scan.next();
            if(answer.equals("Evet")) {
                System.out.println("Sayı beşten büyüktür...");
                }System.out.println("girdiğiniz sayı 25'den de büyük mü? Evet / Hayır ");
                String answer2= scan.next();
                if(answer2.equals("Evet")) {
                    System.out.println("sayı hem 5den hem 25den büyüktür ");
                } System.out.println("girdiğiniz sayı 25den küçük 5den büyük mü? Evet / Hayır ");
                    String answer3= scan.next();
                    if (answer3.equals("Evet")){
                        System.out.println("sayı beşten büyük 25 den küçüktür...");
                    }else{
                        System.out.println("sayılar  geçersizdir....");
                    }
                }
            }








