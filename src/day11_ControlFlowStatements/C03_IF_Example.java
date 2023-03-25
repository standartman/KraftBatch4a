package day11_ControlFlowStatements;

public class C03_IF_Example {
    public static void main(String[] args) {

        // alinin fizik notu 50
        //kimya 30, ortalaması 50 üzerinde ise ekrana geçti yazsın
        //50 ve altında ise herhangi bir şey yazdırmasın
        double fizik=40;  //fizik ve kimyaya double atamak daha doğru olurdu
        double kimya=50;
        double ort= (fizik+kimya)/2;
        System.out.println("ort = " + ort);
        if(ort>50){
            System.out.println(" Ali sınıfı geçti : ");
        }else{
            System.out.println("kaldı");
        }
    }

}
