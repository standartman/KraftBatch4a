package Patika_Calismalar;

import java.util.Scanner;

public class C01_ikinin_Kuvvetini_Bulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print(" sayı giriniz : ");
        int n= input.nextInt();
        for(int i=1; i<=n; i*=2){
            System.out.println(i);
        }

    }

}
