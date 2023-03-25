package day05_Week01_Review;

public class Example {
    public static void main(String[] args){

        //ahmet 1999 doğumludur. şu an kaç yaşındadır

        /* int dogumYil=1999;
        int ahmetYas=2023-dogumYil;
        System.out.println("Ahmet'in Yaşı:" +ahmetYas+ "dır");

        //ahmet 12, annesi 35 yaşında olduğuna göre yaşları toplamı kaçtır? total  count (toplam yaş)
        //şeklinde yazabilirsiniz..

        int ahmetinYasi=12;
        int anne=35;
        int toplamYas=ahmetinYasi+anne;

        System.out.println("toplam yaş=" +toplamYas);*/

        //HOMEWORK

        //emel8 yaşında, fatih emelden 7 yaş büyüktür.
        //salih fatihten 5 yaş küçük ise salihin yaşı kaçtır.

        //BU SORUYU YAPMALIYIM......................

        int emel = 18;
        int fatih= 18+7;
        int salihinYaşı= 18+7-5;
        System.out.println("salih = " +salihinYaşı);

        //öğrencinin adı Harun, öğretmenin adı ise Leyla dır.
        //bu isimleri bir değişkene atayarak değişkeni
        //leyla öğretmen haruna 'aferin' dedi...
        //BUNU DA YAPMALIYIM.....

        String Ögrenci= ("Harun");
        String Öğretmen= ("Leyla");
        //System.out.println(Öğretmen+  " Öğretmen "  +Ögrenci+ "'a \"aferin\" dedi");
        System.out.println(Öğretmen+ " Öğretmen " +Ögrenci+ " öğrencisine \"aferin\" dedi");








        //60 soruluk bir sınavda 4 yanlış 1 doğruyu götürmektedir.
        //Tüm sorulara cevap veren bir öğrencinin 51,25 neti
        //olduğuna göre ,öğrenci kaç soruya yanlış yanıt vermiştir?

        /*double soru=60;
       double net=51.25;
       double yss= (soru-net)/1.25;

       System.out.println(yss);*/

        /*double sorusayısı= 60;
        double net =51.25;
        double yanlışsorusayısı= (sorusayısı-net)/1.25;
        System.out.println("yanlışsorusayısı=" +yanlışsorusayısı);*/



        double toplamSoruAdedi=60;
        double oran=4;
        double net=51.25;
        double yanlisAdet=(toplamSoruAdedi-net)/(1+1/oran);
        System.out.println(yanlisAdet);


        //ali sınıfta 7-7 halı saha maçı planlamak ve
        //oynanan maçta hakem olmak istiyor
        //sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır

        int sinifMevcudu=18;
        int hakem=1;
        int oyuncuSayisi=14;

        int kalan= sinifMevcudu-oyuncuSayisi-hakem;
        System.out.println("kalan="+ kalan);

        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçları planlamak istiyor
        // okul mevcudu 188 ise kaç kişi dışarıda kalır.


        int okulMevcudu=188;
                int hakem1=1;
                int oyuncuSayisi1=14;
                int kalan1= okulMevcudu%(oyuncuSayisi1+hakem1);
        System.out.println("kalan1 = " + kalan1);


        //Bir musluğu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
        //c musluğu ise dolu havuzu 9 saatte boşaltıyor.
        //Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.


















        }








    }

