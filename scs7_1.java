public class scs7_1{
    public static void main(String[] args) {
        int day;
        int month;
        int year;


        int maxDays =31;

        if (month==2){
            if (year%4==0){
                maxDays =29;
            }else{
                maxDays =28;
            }
        }


        else if(month==1 || month ==3 || month==5 || month==7 || month==9 || month==11){
            maxDays=31;
        }
        else if(month==4 || month==6 || month==8 || month==10 || month==12){
            maxDays=30;
        }

        
    }
}