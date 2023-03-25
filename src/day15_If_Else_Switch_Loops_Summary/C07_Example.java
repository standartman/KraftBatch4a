package day15_If_Else_Switch_Loops_Summary;

public class C07_Example {
    public static void main(String[] args) {
        //soru 1: 1-100 arasıçift sayıları yazın

        for(int i=1 ; i<=100  ; i++ ){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        int i=1;
        while (i<=100){
            if(i%2==0){
                System.out.println(i+" ");
            }

        }

    }
}
