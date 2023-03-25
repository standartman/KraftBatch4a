package day11_ControlFlowStatements;

import java.util.Scanner;

public class If_Else_MatSorusu {
    public static void main(String[] args){

        //fizik kimya ve matematik notlarını konsoldan alsın
        //orta 80 üzeri ise geçti yazsın
        //80 ve altında ise kaldınız yazsın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notlarınızı giriniz");
        System.out.print("fizik = ");
        double fizik= scan.nextDouble();
        System.out.print("kimya = " );
        double kimya = scan.nextDouble();
        System.out.print("mat = " );
        double mat= scan.nextDouble();
        double ort=(fizik+kimya+mat)/3;
        System.out.println("ortalamanız = " + ort);
        if(ort>=80){
            System.out.println("vavvv geçti la geçti");
        }else{
            System.out.println("oh no no.olamaz.nittin gardaş...al galdın galdın");
        }


    }
}
