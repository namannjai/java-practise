public class scs6{
    public static void main(String []args){
        int oneNoteAvailable = 0;//customer ke paas ke notes
        int fiveNoteAvailable =3;//customer ke paas ke notes
        int amount = 20;//customer ke paas amount
       if (fiveNoteAvailable==0) {
        if(oneNoteAvailable>=amount){
            System.out.println("five rupee note : 0"+"\none rupee note : "+amount);
        }else{
            System.out.println("-1");
        }
        }
       else if (amount>=(5*fiveNoteAvailable)){
            fiveNoteAvailable =amount/5;
            if(oneNoteAvailable<amount%5){
                System.out.println("-1");
            }else{

            oneNoteAvailable = amount%5;
            System.out.println("five rupee notes :" + fiveNoteAvailable+"\none rupee notes : "+oneNoteAvailable);
            }
        }
        else if(amount<(5*fiveNoteAvailable)){
                fiveNoteAvailable =amount/5;
                if(oneNoteAvailable<amount%5){
                System.out.println("-1");
            }else{

            oneNoteAvailable = amount%5;
            System.out.println("five rupee notes :" + fiveNoteAvailable+"\none rupee notes : "+oneNoteAvailable);
            }
            }
    }
}