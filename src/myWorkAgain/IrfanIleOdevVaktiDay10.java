package myWorkAgain;

import java.util.Scanner;

public class IrfanIleOdevVaktiDay10 {
    public static void main(String[] args) {

        //21 yaşındanküçüklere sigara satılamaz. kodunu yazın
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz :  ");
        String isim= sc.nextLine();
        System.out.println("Lütfen yaşınızı giriniz : ");
        byte yas= sc.nextByte();

        boolean sigaraalabilir=yas>=21;
        System.out.println(isim+ " sigara alabilir mi? = " + sigaraalabilir);


    }

}
