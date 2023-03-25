package day19_Cuatommetohds_Returns;

public class C06_ReturnTheBiggest {
    public static void main(String[] args) {
        System.out.println("max(5,10) = " + max(5, 10));


    }

    // amethod that returns the biggest number

    public static int max(int a, int b){
        int result=0;
        if (a>b){
            result=a;
        }else {
            result=b;
        }
        return result;
    }
}
