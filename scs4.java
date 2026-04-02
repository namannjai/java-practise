public class scs4{
    public static void main(String []args){
        
        int distance=4;
        int quantity=1;
        int foodtype='n'; 
        int bill=0;
        int sum=0;
         if ((foodtype != 'v' && foodtype != 'n') || distance <= 0 || quantity < 1) {
            System.out.println("-1");
            return;
        }
        
if(distance<=3 && distance>0){
  sum = 0;
  
}
else if(distance>=4 && distance <=6){
    sum = (distance-3)*1;
}else if(distance>=7){
    sum = (3)+ (distance-6)*2;
}        
 if(foodtype == ('n')){
 bill = (quantity*15) + sum;
}
else if(foodtype == ('v')){
    bill=(quantity *12)+sum;
}else{

}
System.out.println("bill is :" +bill);
    }
}