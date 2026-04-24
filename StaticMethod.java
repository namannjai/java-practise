class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+"  " + price +"  " +name);
    }
    public static void show1(Mobile h1){
         System.out.println(h1.brand+"  " + h1.price +"  " +name);
    }
}
public class StaticMethod {
    public static void main(String []args){
        Mobile h1 =new Mobile();
        h1.brand = "samsung";
        h1.price =150;
        Mobile.name="smartphone";

        Mobile h2 = new Mobile();
        h2.brand="nokia";
        h2.price = 130;

        h1.show();
        h2.show();
        Mobile.show1(h1);
    }
}