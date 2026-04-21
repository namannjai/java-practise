class Computer{
    public void playMusic(){
        System.out.println(" Music Is Playing...");
    }
    public String getMeAPen(int cost){
        if(cost>=10)
            return " Pen";
        
        return " Gareeb";
    }
}
public class lec30{
    public static void main(String []a){
        Computer obj =  new Computer();
        obj.playMusic();
    String str =    obj.getMeAPen(0);
    System.out.println(str);
    }
}