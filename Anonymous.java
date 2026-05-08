class A{
public void show(){
    System.out.println("In A show");
}
}
// class B extends A{
//     public void show(){
//         System.out.println("In B show");
//     }
// }
public class Anonymous{
    public static void main(String[] args) {
        A obj = new A(){
            public void show()
            {
            System.out.println("In new show");
            }
        };
        obj.show();
    }
}