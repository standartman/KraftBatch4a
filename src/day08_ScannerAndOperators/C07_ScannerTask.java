package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask {
    public static void main(String[] args){
        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz: Kayseri
        //        Kaydiniz basariyla tamamlanmistir.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yaş=scanner.nextInt();

        System.out.println("Doğum Yerinizi Giriniz: ");
        String dogumYeri= scanner.nextLine();

        System.out.println("İsminiz : "+isim);
        System.out.println("soyisminiz: "+soyisim);
        System.out.println("yaşınız: "+yaş);
        System.out.println("Doğum Yeriniz: "+dogumYeri);
        System.out.println("kaydınız başarıyla tamamlanmıştır. ");

        //kullanıcının istediğimiz veri türünde değer girişi yapmazsa
        // kodumuzda hata oluşur, execution durur
        // hatalı imputlara karşı nasıl tedbirler alacağımızı daha sonra göreceğiz
        //şimdi kullanıcı 

        //nextLine= i we are using nextline() mrthod after the other methods





    }
}
