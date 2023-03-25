package myWorkAgain;

public class IrfanIleYasSorusu {
    public static void main(String[] args) {
        int age=22;
        String healt= "healty";

        boolean tobeTester=age>=20&&healt=="healty";
        System.out.println("tobeTester = " + tobeTester);

        tobeTester=age>=22&&healt=="healty"||age>19&&healt=="poorly";
        System.out.println("tobeTester = " + tobeTester);


    }

}
