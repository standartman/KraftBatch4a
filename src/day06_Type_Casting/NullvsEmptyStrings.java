package day06_Type_Casting;

import java.util.Scanner;

public class NullvsEmptyStrings {
    public static void main(String[] args) {

        //null string; string bir değişkene henüz bir şey atanmadığı(assign edilmediği) anlamına gelir
        //Empty string; lenght(karakter boyu) i sıfır olan bir string yapısını temsil eder
        //String s;
        //String st= "";
        //(null)

        //String pencil = null;
       // System.out.print(pencil);
        // bu çalıştırmada null olarak çağırdı.

        //String pencil= "";
        //System.out.println(pencil);
        Scanner sc=new Scanner(System.in);

        System.out.println("number1 : ");
        int number1= sc.nextInt();
        System.out.println("number2 : ");
        int number2= sc.nextInt();
        System.out.println("number3 : ");
        int number3=sc.nextInt();
        int sum=number1+number2+number3;
        System.out.println("sum = " + sum);

        System.out.println("---------------");

        System.out.println("bir sayı giriniz : ");
        int km= sc.nextInt();
        double mil= sc.nextDouble();
         km=(int)mil;
        System.out.println(km+" kilometre "+mil+" mil yapar.");



    }


}
