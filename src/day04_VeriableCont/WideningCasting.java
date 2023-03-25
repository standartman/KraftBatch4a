package day04_VeriableCont;

public class WideningCasting {
    public static void main(String[] args){


        int sayi = 9;
        double kur = 18.9;

        kur = sayi;     //int tipindeki 9 değerini double içine attım.
                        // bu dönüştürme tipine WideningCasting İmplicitCasting
        System.out.println(kur);
    }
}
