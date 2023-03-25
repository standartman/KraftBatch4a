package day15_If_Else_Switch_Loops_Summary;

public class C02_If_Else_Example {
    public static void main(String[] args) {
        int not=84;
        String str="";
        if(not<40){
            str="F";
        } else if ((not<55)) {
            str="D";
        } else if (not<70) {
            System.out.println("C");
        } else if (not<85) {
            System.out.println("B");
        } else {
            str="A";
        }
    }
}
