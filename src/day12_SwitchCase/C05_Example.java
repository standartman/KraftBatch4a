package day12_SwitchCase;


import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        //öğrencinin ortalamasını alın
        //ort 50 altında ise zayıf
        //50 dahil 70 arası orta
        //70 dahil 85 arası iyi
        //85 ve üzeri pekiyi ekrana yazdırsın
        //

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notlarınızı giriniz");

        double mat= scan.nextDouble();
        System.out.println("mat = " + mat);
        double fizik= scan.nextDouble();
        System.out.println("fizik = " + fizik);
        double kimya= scan.nextDouble();
        System.out.println("kimya = " + kimya);
        double turkce= scan.nextDouble();
        System.out.println("turkce = " + turkce);
        double fen= scan.nextDouble();
        System.out.println("fen = " + fen);
        double ort=(mat+fizik+kimya+turkce+fen)/5;
        if(ort<50){
            System.out.println("zayıf");
        } else if (ort>=50&&ort<70){
            System.out.println("orta");
        } else if (ort>=70&&ort<85) {
            System.out.println("iyi");
        } else{
            System.out.println("pekiyi");

        }


    }



        }


