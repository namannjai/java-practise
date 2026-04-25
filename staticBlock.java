class Mobile{
    String brand;
    int price;
    static String name;

    static{
    name = "phone";
    System.out.println("in static");
          }
          public Mobile(){
            brand ="";
            price=200;
            System.out.println("in constructor");
          }
    public void show(){
        System.out.println(brand+"  " + price +"  " +name);
    }
    // public static void show1(Mobile h1){
    //      System.out.println(h1.brand+"  " + h1.price +"  " +name);
    // }
}

public class staticBlock {
    public static void main(String []args){
        Mobile h1 =new Mobile();
        // h1.brand = "samsung";
        // h1.price =150;
        

        Mobile h2 = new Mobile();
        // h2.brand="nokia";
        // h2.price = 130;

        h1.show();
        h2.show();
        // Mobile.show1(h1);
    }
}