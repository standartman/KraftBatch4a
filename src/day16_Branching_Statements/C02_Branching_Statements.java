package day16_Branching_Statements;

public class C02_Branching_Statements {   //dallanma iadeleri   break, continue, return
    public static void main(String[] args) {

        //break
       /* int x=1;
        for (int i=0 ; i<100;  i++){
            x++;
            if (x==5){
                break;
            }
            System.out.println(x+" ");
        }
        System.out.println("program sonlandı");*/

        // 0 ve 20 dahil aradaki çif sayıların toplamını ekrana yazdıran programı yazdırınız ,

        int sum=0;
        for (int i=0 ; i<=20; i+=2){
            sum+=i;
        }
        System.out.println("sum = " + sum);


    }
}
