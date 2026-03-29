public class ram {
    public static void main(String[] args) {

        int n = 12345678;  // input number
        int count = 0;

        while(n > 0){
            
            n = n / 10;
            count++;
            
        }

        System.out.println("Digits: " + count);
    }
}