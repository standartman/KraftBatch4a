package day19_Cuatommetohds_Returns;

public class C05_NameOfMonth {
    // create a method that can display the name of the month based on

    public static void main(String[] args) {
        System.out.println("nameOfMonth() = " + nameOfMonth(10));
    }

    public static String nameOfMonth(int number){
        String name="";
        switch (number){
            case 1:
                name+="January";
                break;
            case 2:
                name+="Feb";
                break;
            case 3:
                name+="mar";
                break;
            case  4:
                name+="April";
                break;
            case 5:
                name+="may";
                break;
            case  6:
                name +="june";
                break;
            case 7:
                name+="july";
                break;
            case 8:
                name+="august";
                break;
            case 9:
                name+="september";
                break;
            case 10:
                name+="october";
                break;
            case 11:
                name+="nov";
                break;
            case 12:
                name+="december";
                break;
            default:
                name+="Invalid  ";

        }
        return ("Month Name : "+name);
    }
}
