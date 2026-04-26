class A2{
    A2(){
        System.out.println("A");
    }
}
class B2 extends A2{

    B2() {
        System.out.println("B");
    }
    
}
public class Mock2{
    public static void main(String[] args) {
        new B2();
    }
}