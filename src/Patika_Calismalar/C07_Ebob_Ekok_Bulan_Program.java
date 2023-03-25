package Patika_Calismalar;

import java.util.Scanner;

public class C07_Ebob_Ekok_Bulan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1= input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2= input.nextInt();

        //EKOK bulma 6-8
        for(int i=1; i<=(n1*n2); i++ ){
            if(i%n1==0 && i%n2==0){
                System.out.print("ekok : "+i);
break;
            }

        }

    }
}
