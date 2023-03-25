package day12_SwitchCase;

import java.util.Scanner;

public class C04_Nested_If {
    public static void main(String[] args) {
        //bir havuza girişte kullanıcıya yaşını sor. 18 değilse giremezsin yazsın
        //18 ise yanında eşi var mı sorsun. evet ise yüzme bilip bilmediği sorsun.
        //evet ise hoşgeldiniz. hayaır ise giremezsin yazsın

        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınız ");
        int yas = scan.nextInt();
        if (yas >= 17) {
            System.out.print("yanınızda eş var mı? Evet/hayır");
            String yanit = scan.next();
            if (yanit.equals("Evet")) {
                System.out.println("yüzme biliyormusunuz?Evet/Hayır");
                String yanit2 = scan.next();
                if (yanit2.equals("Evet")) {
                    System.out.println("hoş geldiniz");
                }
            }else{
                System.out.println("yok");
            }
        }
    }
}