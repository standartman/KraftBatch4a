package day19_Cuatommetohds_Returns;

public class C01_Practice_Tasks2 {
    // tl to dollar
    public static void main(String[] args) {
        tlToDollar(25000);
        System.out.println(kgToLb(10));
        signOfNumber(-6);
        signOfNumber(5);
        signOfNumber(0);
        System.out.println("-------------");
        eachCharInString("Muratgilin damından atlayamadım");
        calculator(10,2,'+');
        calculator(10,2,'-');
        calculator(10,2,'*');
        calculator(10,2,'/');
    }
    public static void tlToDollar(int TL){
        System.out.println(TL+" TL makes "+Math.round((TL/19.04)*100)/100.0+"USD");
    }
    //2. create a method that can convert kg to lb
    public static double kgToLb(double kg){
        double result ;
        result=Math.round((kg*2.20462262)*100)/100.0;
        return  result;
    }
    //create a method that can determine  if the given int is positve, negative or zero
    public static void signOfNumber(int number){
        if(number<0)
            System.out.println(number+" is anegative number ");
        else if (number>0)
            System.out.println(number+" is apositive number ");
        else System.out.println(number+" is zero ");

    }
    //create a method named printEachChar that can print each characters of a string
    public static void eachCharInString(String str){
        for (int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i)+" ");
        }




    }
    ////  5.

    /**
     * create a method named calculator that passes three arguments (num1, num2, mathOperator),
     *     ////    prints the calculation result
     * @param num1
     * @param num2
     * @param mathOperator
     */
    public static void calculator(double num1, double num2, char mathOperator){
        boolean valid=mathOperator=='+' ||mathOperator=='-'||mathOperator=='*'||mathOperator=='/';
        if(valid){
            switch (mathOperator){
                case '+':
                    System.out.println(num1+num2);
                    break;

                case '-':
                    System.out.println(num1-num2);
                break;

                case '*':
                    System.out.println(num1*num2);
                    break;

                case '/':
                    System.out.println(num1/num2);

            }
        }else {
            System.err.println("Invalid Math Operator"+mathOperator);
        }


    }






}
