
public class Main {

    public static void main(String[] args) {
        int number1 = 220;
        int number2= 284;
        int reminder1 = 0;
        int reminder2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1%i==0) {
                reminder1=reminder1+i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2%i==0) {
                reminder2=reminder2+i;
            }
        }
        if (reminder2==number1||reminder1==number2) {
            System.out.println("Arkadas sayilar");
        }
        else{System.out.println("Arkadas deiller");}
        
        
        
        
            }}
