package day3_TypeConversion_Casting;

public class _02_NarrowingCasting {
    public static void main(String[] args){
        double deger=5.8;
        int num= 6;
        num=(int)deger; //veri kaybına neden olur

        System.out.println("num = " + num); //5 verdi.  veri kaybı çok net görülüyor

        double deger2=5.6;
        short sh=2;
        sh=(short)deger2;
        System.out.println("sh = " + sh);
    }
}
