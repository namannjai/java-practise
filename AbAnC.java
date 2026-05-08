abstract class A{
  abstract  public void show();
}
public class AbAnC{
    public static void main(String args[]){
        A onj = new A(){
            public void show(){
                System.out.println(".()");
            }
        };
        onj.show();
    }
}