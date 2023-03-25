package day11_ControlFlowStatements;

public class C06_If_IfElse_ {
    public static void main(String[] args) {

        // A ve B, 2 adet int sayıyı karşılaştırın
        // A büyüktür B'den
        // B büyüktür A'den
        // A ve B eşittir

        int a=10;
        int b=11;
        if(a>b){
            System.out.println("A büyüktür B");
        }else if(a==b){
            System.out.println("A ve B eşittir");
        }else if(b<=a){
            System.out.println("B büyüktür A");
        }else if(a+b>22){
            System.out.println("toplam büyük ");
        }else {
            System.out.println("boş mu kaldın kodum");

        }







    }
}
