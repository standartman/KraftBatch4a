package day06_Type_Casting;

import java.util.Arrays;

public class AritmeticOperators {
    public static void main(String[] args){

        /*int x=1458762;
        int y=7;
        int z= x+y;
        int z1= x*y;
        //System.out.print("harun"+x*y);  //veya (x+y)
         int t=x%y; //bu işaret ( % ) mod alma işlemi işlemidir. bir sayının diğer bir sayıya bölümünden KALAN sayıya
         // mod alındı veya o sayının modu denir. ÖRNEĞİN
         int x=5;
         int y=3; ise
         int z= x%y istiyorsa cevap z=2 2dir... Syststem.out.println(z); verilecek çıktı 2'dir
         System.out.println(t); */

        int sayi= 3+5/2*4%(12-9);
        //ÇOK ÖNEMLİ BİR DURUMU UNUTMA. MATEMATİKTEKİ İŞLEM ÖNCELİĞİ KONUUSNU UNUTMA. ÖNCE PARANTEZ İÇİ SONRA ÇARPA BÖLME
        //3+5/2*4%3
        //3+2*4%3
        // 3+8%3
        // 3+2
        // 5
        System.out.println("sayi= "+sayi);

        int h= 6;
        int y=4;
         double c= (double)h/y;
         System.out.println(c);
         //BU ÖRNEK GÜZEL
        // EĞER İNT İKİ İFADEYİ değiştirmeden assign edersen int yani tam sayı olarak böler. 1.5 olması gereken işlem
        //1 olarak çıkar. ancak bir tanesini double olarak genişletirsen o zaman 1.5 olarak doğrusunu verir

        int t=h%y; //mod alma işlemi önemli.
        // küçük rakamlarla kafamızdan yapabiliyor olsakta büyük rakamlar olduğunda çok önemli
        System.out.println(t);



















    }
}
