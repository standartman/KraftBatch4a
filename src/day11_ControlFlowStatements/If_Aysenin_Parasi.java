package day11_ControlFlowStatements;

public class If_Aysenin_Parasi {
    public static void main(String[] args) {
        //Ayşenin cep harçlığı 5 lira veya daha az  ise babası ona 10 lira versin
        int ayseninParasi= 6;
        if(ayseninParasi<=5){
            int c=ayseninParasi+10;
            System.out.println("c = " + c);
        }else{
            System.out.println("hadi ordan");
        }

    }
}
