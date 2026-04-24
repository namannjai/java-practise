class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    


}

public class Encapsulation1{
    public static void main(String []args){
        Human obj = new Human();
       obj.setName("naman"); 
       System.out.println(obj.getName());
    }
}