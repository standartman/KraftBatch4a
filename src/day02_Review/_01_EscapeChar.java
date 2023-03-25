package day02_Review;

public class _01_EscapeChar {
    public static void main(String[] args) {

        System.out.println("\"Hello World\"");

        //  yorum satırları yani comment


        /*
        \* yeni SATIR
        \t backspace
        \" çift tırnak
        \\  \koyar
        \r satır başı
      integer
          byte 127, -128 1 byte
            short
            int
            long
        Float - double = virgüllü ifadeleri kullanmak için
        bu ikisi arasında daha çok double kullanılır
        double  // 5.5 veya 1258.12456689

     char
     Boolean = true or false
      */     //herşey comment olur
        System.out.println("p");
        System.out.println("     a");
        System.out.println("z");
        System.out.println("      a");
        System.out.println("r");
        System.out.println("      t");
        System.out.println("e");
        System.out.println("      s");
        System.out.println("i");


        System.out.println("P\n\ta\nz\na\r");


float f=5.8f;
double d=5.5;
char c='h';
boolean b=true;


int num1= 1_000_000_000;
        System.out.println(num1);

        byte byteMin=Byte.MIN_VALUE;
        byte byteMax=Byte.MAX_VALUE;

        short shortMin= Short.MIN_VALUE;
        Short ShortMax= Short.MAX_VALUE;

        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        System.out.println("shortMin = " + shortMin);
        System.out.println("ShortMax = " + ShortMax);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);






    }
}
