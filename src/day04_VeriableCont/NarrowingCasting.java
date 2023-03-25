package day04_VeriableCont;

public class NarrowingCasting {
    public static void main(String[] args){
        double rate = 3.9;

        int num = 10;       // double tipindeki 3.9 sayısını int kısmını al diye talimat verdik
                            // type dönüşünü manuel manuel casting deniyor
        num = (int)rate;
        System.out.println(num);
    }
}

