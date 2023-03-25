package day5_reviewSecondWeek;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //task 4
        //Kullanıcıdan 2 int değeişken  alınız ve
        //sayıların farklarının tek olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.
        Scanner sc=new Scanner(System.in);
        System.out.println("İki Sayı Giriniz: ");
        int bir= sc.nextInt();
        int iki= sc.nextInt();
        boolean tekmi=(bir-iki)%2==1;
        System.out.println("tekmi = " + tekmi);
    }
}
