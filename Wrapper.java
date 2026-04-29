public  class Wrapper{
    public static void main(String args[]){
        int num =7;
        // Integer num1 = new Integer(8);
         Integer num1 = 8;

         Integer num2 = num;// auto boxing
        // int num3 = num2.intValue(); // unboxing
         int num3 = num2; // auto unboxing
        System.out.println(num3);
        String str ="31";
        int num4 = Integer.parseInt(str);
        System.out.println(num4 *11);
    }
}