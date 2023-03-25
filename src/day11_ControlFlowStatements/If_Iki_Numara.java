package day11_ControlFlowStatements;

public class If_Iki_Numara {
    public static void main(String[] args) {
        // iki numara kabul etsin numaraların eşit olulp olmadığını kabul etsin
        /*int x=5;
        int y=5;
        if(x==y){
            System.out.println("eşitler vay bee");
        }else {
            System.out.println("tutturamadın");*/

            // iki numara kabul etsin numaralardan büyük olanı döndürsün
        /* int a=10;
        int b=11;
        if (a>b){
            System.out.println("a");

        }else {
            System.out.println("yok");*/

        //3int değişken atayalım ilk iki değişkenin toplamı 3. den fazla ise ilk
        //ikisinin farkını üçüncüye ata

        int u=12;
        int k=15;
        int e=30;
        if((u+k)>e){
            e=u-k;
            System.out.println("e = " + e);
        }else {
            System.out.println("canın sağolsun");
        }
    }


}
