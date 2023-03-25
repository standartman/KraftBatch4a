package day11_ControlFlowStatements;

public class If_Dik_Ucgen {
    public static void main(String[] args) {
        // progarm üç açı kabul etsin açılardan biri 90 ise bu bir dik üçgendir desin
        int a=80;
        int b=40;
        int c=70;
        if((a+b+c==180)&&a==90||b==90||c==90){
            System.out.println("dik üçgen");
        }else {
            System.out.println("değil");
        }


        }






}
