import java.util.*;
public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

        for (int i=1;i<=n;i++){//it will also run with int i =0 but uske karan ek loop extra chalega aur answer same hi aayega
        
            sum = sum+i;
            
        }
        System.out.println(sum);



    }
}