public class scs3{
    public static void main(String []args){
        int a =2;
        int b =2;
        int c=7   ;
        if(a==7){
                 if(b==7){
                         if(c==7){
                                System.out.println("-1");
                          }else{
                    System.out.println(c);
                 } 
                 }else{
                    System.out.println(b*c);
                 }
      } else if (a!=7) {
                 if(b!=7){
                         if(c!=7){
                                System.out.println(a*b*c);
                          }else{
                            System.out.println("-1");
                          }
                 } else if(c==7){
                    System.out.println("-1");
                 }else{
                    System.out.println(c);
                 }
     }else{
        System.out.println(b*c);
     }
      
       
}
}