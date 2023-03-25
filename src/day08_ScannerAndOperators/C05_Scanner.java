package day08_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args){
        //1. adım Scanner objesi oluşturalım
        Scanner scan = new Scanner(System.in);

        //2.  kullanıcıyı bilgilendireceğiz. ne  istediğinizi söyleyin
        System.out.println("Lütfen isminizi giriniz");

        //3/ girilen bilgiyi içine koyabileceğiniz
        // oluşturduğumuz değişkenin içine, scanner objesi ile uygun metodu çağırarak veri alın

        String name= scan.nextLine();
        System.out.println("girilen İsim:" +name);

        scan.close();//bunu yazınca da scan sınıfını kapatıp kullanmıyoruz daha

    }
}
