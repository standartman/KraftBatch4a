package day11_ControlFlowStatements;

import java.util.Scanner;

public class C05_If_Else_Example {
    public static void main(String[] args) {
        /*System.out.println("A");
        if(true){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
        System.out.println("D");*/

        //hava sıcaklığı 20 derecenin altında ise hava soğuk
        //20 derece ve üzerinde ise hava sıcak yazsın

        Scanner scan=new Scanner(System.in);
        System.out.println("hava sıcaklığı giriniz=");
        int hava=scan.nextInt();
        if(hava>=18){
            System.out.println("hava sıcak");
        }else
            System.out.println("hava soğuk");

    }
}
