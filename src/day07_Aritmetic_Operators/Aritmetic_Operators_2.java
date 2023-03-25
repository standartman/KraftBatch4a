package day07_Aritmetic_Operators;

public class Aritmetic_Operators_2 {
    public static void main(String[] args){

        /*int x=5;
        int y=10;
        int z=x+y;
        System.out.print(z);

        //mod alma işlemi
        System.out.println();*/

        int dogumYili=1960;
        int suAnkiYil=2023;
        int yas=(suAnkiYil-dogumYili);
        System.out.println("yas = " + yas);
        System.out.println("------------");

        int ali=1990;
        int ahmet=1990+5;
        int ahmetinYasi=2023-(ahmet);
        System.out.println("ahmetinYasi = " + ahmetinYasi);
        System.out.println("---------------");

        int r=2;
        double alan=(3.14*2*2);
        double cevre= 2*3.14*2;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
        //BU ÇÖZÜM BENİM BODOSLAMA YAPTIĞIM ÇÖZÜM.
        //ŞİMDİ JAVA DİLİNDE  YAPILMASI GEREKEN ÇÖZÜMÜ YAPAYIM

        double alan2=Math.PI*Math.pow(r,2);
        System.out.println("alan2 = " + alan2);
        double cevre2=Math.PI*2*r;
        System.out.println("cevre2 = " + cevre2);
        System.out.println("----------------");


        //ÖNEMLİ NOT : java da mATH adlı bir sınıf var. onun içinden istediğimiz işlemi alıp assign edebiliriz

           int f=300;
           double celcius=(f-32)/1.8;
        System.out.println("celcius = " + celcius);
        System.out.println("-------------");

        int fizik =92;
        int kimya=55;
        int mat=89;
         double notOrt= (fizik+kimya+mat)/3;
        System.out.println("notOrt = " + notOrt);

        boolean isPas=notOrt>95;
        System.out.println("Ali sınıfı geçti mi:"+isPas);
        System.out.println("------------");
        int toplamSira=15;
        int birSiradakiKoltuk=12;
        int toplantiKatilimi=113;
        int toplamKapasite=toplamSira*birSiradakiKoltuk;
        System.out.println("toplamKapasite = " + toplamKapasite);
        int bosKoltuk=toplamKapasite-toplantiKatilimi;
        System.out.println("bosKoltuk = " + bosKoltuk);
        double oturulanSira=toplantiKatilimi/toplamSira;
        System.out.println("oturulanSira = " + oturulanSira);


    }
}
