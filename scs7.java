public class scs7{
    public static void main(String []args){
        int day =10;
        int month = 11;
        int year = 7;

        System.out.print(++day + "-");
        System.out.print(month +"-");
        if(year<=9 && year>=0){
            System.out.print("200"+year);
        }else{
            System.out.print("20"+year);
        }
    }
}