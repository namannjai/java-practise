class Cailc{
    public int add(int a , int b){
        return a+b;
    }
}
class AdvCailc extends Cailc{
    public int add(int a, int b){
        return a-b;
    }

}
public class MethOver1{
    public static void main(String[] args) {
        AdvCailc obj = new AdvCailc();
       int r1= obj.add(5,4);
       System.out.println(r1);
    }
}