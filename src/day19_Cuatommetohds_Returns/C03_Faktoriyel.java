package day19_Cuatommetohds_Returns;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        System.out.println("faktoriyelHesapla(4) = " + faktoriyelHesapla(4));
    }
    //verdigimiz bir sayinin faktoryelini hesaplayip
    // sonucu bize donduren bir method olusturun
    /* method oluşturma aşamaları
    1.public static (standart)
    2.oluştracağımız netod bize bir sonuç döndürecekse data tipini belirtmek gerekiyor
    3.metod adı
    4. metodun parantezleri() parametre olup olmayacağı ve parametre data tipleri ve isimleri parantez içerisine yazılır
    5{} body aç, döndürülme işlemi yap
    6. returnkeywordu ile döndürülmesi planlanan değeri döndür
     */
    public static int faktoriyelHesapla(int sayi){
        int faktoriyel=1;
        for (int i=1; i<=sayi; i++){
            faktoriyel*=i;
        }
        return faktoriyel;

    }
}
