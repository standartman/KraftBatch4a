package day12_SwitchCase;

public class HaftaninGunleri {
    public static void main(String[] args) {
        //haftanın gününü kullanıcıdan alın ve ekrana o günün ismini yazdırın
        int weekDay=7;
        switch (weekDay){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            default:
                System.out.println("yanlış sayı");
        }



    }


}
