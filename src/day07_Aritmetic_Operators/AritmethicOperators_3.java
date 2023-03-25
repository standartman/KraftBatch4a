package day07_Aritmetic_Operators;

public class AritmethicOperators_3 {
    public static void main(String[] args){
        //4500 dk kaç saattir
        double dk=4500;
        double saat=60;
        double kacSattir=dk/saat;
        System.out.println("kacSattir = " + kacSattir);
        System.out.println("--------------");

        // 31502 saniye kaç saat kaç dakika kaç saniyedir?

        int toplamSaniye= 31502;
        int saat1= toplamSaniye/3600;
        int dakika=toplamSaniye%3600/60;
        int saniye=toplamSaniye%60;
        System.out.println(saat1+" saat "+dakika+" dakika "+saniye+" saniye ");






    }
}
