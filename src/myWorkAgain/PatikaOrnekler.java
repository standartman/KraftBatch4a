package myWorkAgain;

import java.util.Scanner;

public class PatikaOrnekler {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner scan=new Scanner(System.in);
      do {
          System.out.print("Bir Sayı Giriniz : ");
          n= scan.nextInt();
          if(n%2==1){
              total+=n; //total=total+n
          }
      }while (n>0);
        System.out.println("Toplam : "+total );







    }









    }


