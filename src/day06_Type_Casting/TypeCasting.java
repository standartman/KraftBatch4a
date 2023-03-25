package day06_Type_Casting;

public class TypeCasting {
    public static void main(String[] args){

        //byte, short, int, float, double, long
        // char, boolean

        //BU KONU ÖNEMLİ

        // Eğer datası küçük olan veri tipini datası büyük olan bir veri tipine atamak istiyorsan
        // İNTELİJ bunu kabul ediyor
        //Bunun ingilizce ismi widening casting dir. bunu ide otomatik yapar

        // Ancak datası büyük olan bir veri tipini datası küçük olana atamak istersek hata verecek
        // vede bizden parantez içinde ne yapmamızı yazmamaızı isteyecek. bunun da ingilizce ismi Narrowing castingdir
        // bunu kendimiz yazmamız gereklidir
        // (byte)s gibi.


        byte b=5;
        short s=129;  //veri kaybı oldu.
        b=(byte)s;
        System.out.println(b);


        int i=10;
        double d=20;
        d=i;  //bu olur

        //4 byte=8byte

        i=(int)d;

     float f=2.5f;
     i=(int)f;
     System.out.println(i);
     //mesela bu örnekte float 2.5 iken int değerine dönüştürüldüğünde 2 olarak çıktı veriyor bize
        //yani 0.5 lik bir veri kaybı oluşmuş oluyor. (büyük datalı olanı küçük datalıolana çevirdiğimiz zaman)
        //byte<short<int<float<long
        //ancak yine aynı örnekte f yi çağırsaydık yani assign etseydik sonuç 2.5 olacaktı


     //null vs Empty Strings


        String pencil= "";
        System.out.print(pencil);

        //type casting

                //bir veri türünün başka bir veri türne dönüştürülmesi

        /*byte x=10;
        byte y=20;
        byte z= (byte)(x+y);

        short a=5;
        short c=10;
        short e= (short) (a+c);*/

        double x=5.2;
        double y=5.6;
        int z=(int) (x+y);
        //burada double değişkenleri int olarak atamak istediğimizde parantez içinde int yazmalıyız.
        // sonrada iki değişkeni de parantez içinde yazmalıyız. ancak değişkenlerden birisi int olsaydı o zaman
        // sadece int olmayanın önüne parantez içinde int yazdığımız zaman integer bir ifadeye dönmüş olacaktı
        // ÖRNEK
        double r=5.7;
        int u= 6;
        int w= (int)r+u;
        System.out.println(w);


        //ARİTMETİK OPERATÖRLER
        //TOPLMA ÇIKARMA ÇARPMA BÖLME MOD ALMA




    }
}
