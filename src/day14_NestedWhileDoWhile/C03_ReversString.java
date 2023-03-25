package day14_NestedWhileDoWhile;

public class C03_ReversString {
    public static void main(String[] args) {

        String str= "teneke";
        //           012345
        System.out.println("str.lengh()="+str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));

        for (int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));

        }

    }
}
