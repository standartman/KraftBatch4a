package day11_ControlFlowStatements;

import java.util.Scanner;

public class If_ElseSoru {
    public static void main(String[] args) {

        //kullanıcıdan bir tam sayı alın
        //        // ekrana tekmi çift mi olduğunu
        //        // yazdıran programı yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int number= scan.nextInt();
        boolean sayi=(number%2==0);
        if(sayi){
            System.out.println("çift");
        }else {
            System.out.println("tek");
        }
        }


    }

