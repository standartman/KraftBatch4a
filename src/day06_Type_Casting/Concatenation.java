package day06_Type_Casting;

import com.sun.source.util.SourcePositions;

public class Concatenation {
    public static void main(String[] args){
        String a="Merhaba";
        String b="Dünya";
        String c=a+b;
        //System.out.println(c);
        //System.out.println(c+ " ne var ne yok");
        //System.out.println(2+5+c);
        System.out.println(a+2+5);
        // concatenation (+) ifadesine kadar olan kısım normal çıktı verecek.ancak sonrasında + ifadesi string bir ifade
        //olduğu için gerisni string birifade olarak alacak; ÖRNEĞİN
        System.out.println(2+6+a+3+9);  //bu ifadede concatenationu bilmesek 8merhaba11yazacağını düşünürdük
        //ancak + ifadesini öğrendikten sonra doğrusu 8Merhaba39 olur

        System.out.println(3+8+a+(2+5+7));
        //böyle bir durumda ise önce parantez içini yapıp sonrasında ifadeyi normal çıkartacak
        //int değer koyarsak
        int i=10;
        System.out.println(i+3+8+a+(2+5)+7+ " Dünya");

        //concatenation + dır. gördük lan zaten




    }
}
