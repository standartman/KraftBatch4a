package day15_If_Else_Switch_Loops_Summary;

public class C03_Nested_If {
    public static void main(String[] args) {
        // alinin cebinde 100 tlvar ise ve zamanı var ise sinemaya gitsin
        //100 tl yokise ev de otursun
        int aliPara=90;
        boolean zaman= true;
        if (aliPara>=100){
            if(zaman){
                System.out.println("sinemaya gidebilir");
            }else {
                System.out.println("zamanı yok gidemez");
            }
        }else {
            System.out.println("parası  yok gidemez");
        }
    }
}
