class A{
    public A(){
        System.out.println("Object is Created");
    }
    public void show(){
System.out.println("inside show method");
    }
}
public class AnonymousObject1{
    public static void main(String[] args) {
        
        new A(); // object is created //for the anonymous objet there is no reference
        /* we cant reuse this kind of object*/

        new A().show();//every time is use this a new object will be created dont trust me ? run the code
    }
}