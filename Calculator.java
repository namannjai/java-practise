public class Calculator {
    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 3;
        char operator = '+';

        String again = "y";

        while(again.equals("y")){
            if(operator=='+'){
                System.out.println(num1+num2);
            }
            else if(operator == '-'){
                System.out.println(num1-num2);
            }
            else if(operator == '*'){
                System.out.println(num1*num2);
            }
            else if(operator =='/'){
                if(num2==0){
                    System.out.println("Division cannot be performed");
                }else{
                System.out.println(num1/num2);
            }
            }else{
                System.out.println("Invalid operaor");
            }
            again="n";
        System.out.println("thankyou for using calculator");
        }
        System.out.println("thankyou for using calculator");
    }
}