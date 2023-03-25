package day13_ForLoops;

public class C06_Tasks {
    public static void main(String[] args) {
        //bir program yazın ve 0-100 arasındaki tüm sayıları yazdırsın
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("------------");

        //bir program yazın 15-100 e kadar yazsın
        for (int i = 15; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("------------");
        //bir program yazım 100 de 1 e kadar geri gitsin

        for (int i = 100; i >= 15; i--) {
            System.out.print(i + " ");
            System.out.println("-----------------");
        }
        //birden yüze kadar olan çift sayıları yazdırın
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        //birden yüze kadar olan tek sayıları yazdırın
        for (int i=1  ;  i<=100   ;  i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }

    }
}


