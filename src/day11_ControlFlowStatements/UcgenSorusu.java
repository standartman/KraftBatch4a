package day11_ControlFlowStatements;

public class UcgenSorusu {
    public static void main(String[] args) {
        //üç adet iç açı alsın ve bunun üçgenolup olmadığını kontrol etsin
        int a=30, b=70, c=50;
        if ((a+b+c)==180){
            System.out.println("bu bir üçgen");
        }else {
            System.out.println("değildir");
        }
    }
}
