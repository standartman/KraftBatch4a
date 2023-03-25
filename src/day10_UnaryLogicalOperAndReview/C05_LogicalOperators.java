package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C05_LogicalOperators {
    public static void main(String[] args){
        String name = "Ayşe";
        int age= 19;
        String citizen= "Türkiye";

        //18+, Türkiye vatandaşı
        boolean isEligibleVote= age>=18 && citizen=="Türkiye";
                                // 34>=18 && "Türkiye"=="Türkiye"
                                //   true && true
        System.out.println("name = " + name);
        System.out.println("isEligibleVote = " + isEligibleVote);
        System.out.println("--------------------");

        int a=5;
        int b=7;
        boolean bl=(b==(a+2));
        System.out.println("bl = " + bl);
        System.out.println("-----------");

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas= sc.nextInt();
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        String saglik= sc.nextLine();

        boolean oyKullanabilirmi= yas>=18 && saglik=="sağlık";
        System.out.println("oyKullanabilirmi = " + oyKullanabilirmi);


    }
}
