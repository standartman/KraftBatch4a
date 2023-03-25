package day20_CustomMethods_Overloading;

public class C05_MethodOverloading3 {

    public static void main(String[] args) {
        concat(5,"Ali Osman", true);
        concat(10, "Ali Osman", false);
    }
    public static void concat (int i, String str, boolean bl){
        if(bl){
            System.out.println(i+str);
        }else {
            concat(i,str);
        }
    }
    public static void concat(int num, String str){
        for (int i=1;  i<=num;  i++ ){
            System.out.println(str);
        }
    }
}
/*
 * 3 parametreli bir method yazin int ve String ve boolean tipinde 3 parametre alsin
 * Boolean true ise int ve String değeri concat yapsın.
 * false ise başka bir methodu çağırsın ve String değeri int kadar yazdırsın.*/
