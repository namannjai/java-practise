class Human{
    private int age;
    private String name;
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }

}

public class Encapsulation{
    public static void main(String []args){
        Human obj = new Human();
       obj.setName("naman"); 
       System.out.println(obj.getName());
    }
}