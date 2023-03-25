package day11_ControlFlowStatements;

import java.util.Scanner;

public class Sıcaklık {
    public static void main(String[] args) {

        //C05 If else example öneğinin aynısı(KENDİM ÇALIŞMA ADINA YAPTIM)
        Scanner scan=new Scanner(System.in);
        System.out.println("Sıcaklık değeri giriniz");
        double hava= scan.nextDouble();
        if(hava>=20){
            System.out.println("yanayrız la");
        }else{
            System.out.println("uşıyırım");
        }
    }
}
