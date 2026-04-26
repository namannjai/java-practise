class A1{
    void show(){
        System.out.println("A");
    }
}
class B1 extends A1{
    void show(){
        System.out.println("B");
    }

}
public class Mock1{
    public static void main (String args[]){
        A1 obj = new B1();
        obj.show();
    }
}