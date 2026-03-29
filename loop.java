public class loop {
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        for(int i=1;i<=5;i++){
            if(i==1){
                System.out.println("For Loop:");
            }
            System.out.println(+i);
        }
        // TODO: Print numbers 1 to 5 using while loop
        int j=1;
        while(j<=5){
            if(j==1){
                System.out.println("While Loop:");
            }
            System.out.println(+j);
            j++;
        }
        // TODO: Print numbers 1 to 5 using do-while loop
        int k=1;
        
        do {
            if(k==1){
                System.out.println("Do-While Loop:");
            }
            System.out.println(k);
            k++;
                   }while(k<=5);
    }
}
