class A{
    public void show(){
        System.out.println("inside A class");
    }
    //class B{
       // public void config(){
       //     System.out.println("inside B class");
       // }
    static class B{
        public void config(){
            System.out.println("inside B class");
        }
    }
}
public class InnerClass{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
      //  A.B obj1 = obj.new B();
        A.B obj1 = new A.B();
        obj1.config();
    }
}