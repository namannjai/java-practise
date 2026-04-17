public class scs7_1{
    public static void main(String[] args) {
        int day=31;
        int month=12;
        int year=99;
        


        int maxDays =31;

        if (month==2){
            if (year%4==0){
                maxDays =29;
            }else{
                maxDays =28;
            }
        }


        
        else if(month==4 || month==6 || month==9 || month==11 ){
            maxDays=30;
        }
        day++;
        if(day >maxDays){
            day=1;
            month++;

            if(month>12){
                month=1;
                year++;
            }
        }
        System.out.println(day + "-" + month + "-"  + (2000 +year));
    }
}