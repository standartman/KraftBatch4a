package day11_ControlFlowStatements;

public class X_Su_Ise_Yye_Ata {
    public static void main(String[] args) {
        // eğer X'in değeri 10 ise Y'ye 20 atansın
        // değil ise Y'ye sıfır atansın
        int x=11,y;
        if (x == 10) {
            y=20;
        }else {
            y=0;
        }
        System.out.println("y = " + y);


    }
}
