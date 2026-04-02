public class scs5{
    public static void main(String []args){
        int accountNumber = 1001;
        int salary = 76000 ;
        int accountBalance = 250000;
        String loanType = "business";
        int loanAmountExpected = 300000;
        int emisExpected = 30;
        if(accountNumber >=1000 && accountNumber<=1999){
            if(accountBalance >= 1000){
if(salary>=25000 && salary<=49999){
    if(loanType.equals("car")){
        System.out.println("eligible loan amount : 500000");
        System.out.println("eligible emis : 36");
    }else{
        System.out.println("not eligible for loan");
    }
}else if (salary>=50000 && salary <=74999) {
    if(loanType.equals("house")){
        System.out.println("eligible loan amount : 600000");
        System.out.println("eligible emis : 60");
    }else  if(loanType.equals("car")){
        System.out.println("eligible loan amount : 500000");
        System.out.println("eligible emis : 36");
    }else{
        System.out.println("not eligible for loan");
    }
    
}else if(salary>75000){
    if (loanType.equals("business")){
         System.out.println("eligible loan amount : 750000");
        System.out.println("eligible emis : 84");
    }else  if(loanType.equals("house")){
        System.out.println("eligible loan amount : 600000");
        System.out.println("eligible emis : 60");
    }else  if(loanType.equals("car")){
        System.out.println("eligible loan amount : 500000");
        System.out.println("eligible emis : 36");
    }else{
        System.out.println("not eligible for loan");
    }
}
   }else{
                System.out.println("low account balance");
            }
            }else {
                System.out.println("Invalid account Number");
            }
        }
    }
