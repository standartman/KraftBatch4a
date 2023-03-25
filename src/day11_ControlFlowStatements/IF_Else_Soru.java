package day11_ControlFlowStatements;

import java.util.Scanner;

public class IF_Else_Soru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Fizik Notunuzu Girriniz");
        double fizik=scan.nextDouble();
        System.out.println("Lütfen Kimya Notunuzu Girriniz");
        double kimya=scan.nextDouble();
        System.out.println("Lütfen Matematik Notunuzu Girriniz");
        double mat= scan.nextDouble();

        double ort=(fizik+kimya+mat)/3;
        System.out.println("ort = " + ort);

        if(ort>80){
            System.out.println("sınıfı geçtiniz");
            } else{
            System.out.println("kaldınız");
        }

    }
}
