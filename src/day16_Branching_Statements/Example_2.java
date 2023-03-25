package day16_Branching_Statements;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        //   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.

        Scanner scan=new Scanner(System.in);
        String sifre="Harun123";
        int i=0;
        System.out.println("5 hakkın var ");
        while (i<5){
            System.out.print(i+1+".Tahmin: ");
            String tahmin=scan.next();
            if(tahmin.equals(sifre)){
                System.out.println("tebrikler");
                break;
            }
            i++;
            if(i==5){
                System.out.println("hatalı güle güle");
                break;
            }
            System.out.println("tekrar deneyiniz");



        }
    }
}
