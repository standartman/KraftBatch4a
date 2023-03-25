package day20_CustomMethods_Overloading;

public class C01_NameOfDay {
    public static void main(String[] args) {
        System.out.println("nameOfDay(5) = " + nameOfDay(5));
    }
    //create a method that returns the name of the day based on the given number to the method
    public static String nameOfDay(int number){
        String result="";

        if(number<1 || number>7){    //if the number is invalid
            result ="Invalid";
        } else if (number==1) {
            result = "Monday";

        } else if (number==2) {
            result="Tuesday";

        } else if (number==3) {
            result="Wednesday";

        } else if (number==4) {
            result="thursday";

        } else if (number==5) {
            result="Friday";

        } else if (number==6) {
            result="Saturday";

        }else {
            result="Sunday";
        }
        return  result;

    }
}
