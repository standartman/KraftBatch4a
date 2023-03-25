package day18_CustomMethods;

public class C04_PracticeTasks {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("---------");
        evenNumbers();
        System.out.println("--------------");
        eligibleForAlcoholPurchase(22);
        System.out.println("----------");
        eligibleToVote(19, "TR");
        System.out.println("---------");
        areaOfCircle(1);

    }

    //    1. create a method that can print odd numbers between 1~100 in a same line saperated by space

    /**
     * a method that can print odd numbers between 1~100 in a same line saperated by space
     */
    public static void oddNumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    //    2. create a method that can print even numbers between 1~100 in a same line saperated by space
    public static void evenNumbers() {
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


//    3. create a method that can check if a person is eligible to buy alcohol
    public static void eligibleForAlcoholPurchase(int age){
        /**
         * a method that can check if a person is eligible to buy alcohol
         * @param age
         */
        if(21<=age){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Ineligible to buy alcohol");
        }
    }

//    4. create a method that can check if a person is eligible to vote
    //    Ex:
//                eligibleToVote(19, "TR");
//
//            output:
//                You are not eligible to vote!

    /**
     * a method that can check if a person is eligible to vote
     * @param age
     * @param citizenship
     */
    public static void eligibleToVote(int age, String citizenship){
        boolean isEligible = age >= 18 && citizenship.equalsIgnoreCase("TR");
        System.out.println("You are ");
        if(!isEligible) System.out.print("not");
        System.out.print("eligible to vote");
            }
    //    6. create a method that can calculate the area of a circle
    public static void areaOfCircle(int radius){
        double area;
        area=Math.PI*radius*radius;
        System.out.println("acircle with a radius "+ radius+" cm has an area of "+area);

    }




            }

















//    7. create a method that can calculate the area of a square
//    8. create a method that can convert dollar to TL rate:19.04


