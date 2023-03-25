package day07_Aritmetic_Operators;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        // bu yapının adı Scanner sınıfı. kullanıcıdan veri almak için oluşan birsınıfdır.biz kendimizyazmıyoruz da
        // konsola yazılması için aracı oluyoruz gibi düşünebiliriz
        // eğer string bir ifade istiyorsam nextline olacak, int istiyorsam nextint olacak, double istiyorsam nextdouble
        // olacak ve bunun gibi.
        // alttaki örnek de string bir ifade olduğu için scan.next line dedik...
        /*System.out.println("Lütfen bir kelime giriniz: ");
        String str=scan.nextLine();
        System.out.println("girdiğiniz kelime "+str+ " dur");

        System.out.println("kimya: ");
        int kimya=scan.nextInt();
        System.out.println("fizik: ");
        int fizik= scan.nextInt();
        System.out.println("kimyadan "+kimya+" aldım, fizikten "+fizik+" aldım. Çok mutluyum");


        //Ali fizik dersinden 92,
        // kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        // Konsoldan bu değerleri kullanıcıya
        // girdirerek ekrana Ali’nin not ortalamasını yazdırın.

        System.out.println("doğum yılınız: ");
        int yil= scan.nextInt();
        int yas=2023-yil;
        System.out.println("yas = " + yas);*/

        System.out.println("fizik notu: ");
        double fizik1= scan.nextDouble();
        System.out.println("kimya notu:" );
        double kimya1= scan.nextDouble();
        System.out.println("mat notu: " );
        double mat1= scan.nextDouble();
        double ort1=(fizik1+kimya1+mat1)/3;
        System.out.println("ort1 = " + ort1);


    }
}
