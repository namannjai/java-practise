public class scs6_1 {
    public static void main(String[] args) {

        int oneNoteAvailable = 4;
        int fiveNoteAvailable = 3;
        int amount = 19;

        int fiveUsed = amount / 5;/*actual number of five note used in solution(kitne 5 ke note use hue hai)*/

        if (fiveUsed > fiveNoteAvailable) {
            fiveUsed = fiveNoteAvailable;
        }

        while (fiveUsed >= 0) {

            int remaining = amount - (fiveUsed * 5);

            if (remaining <= oneNoteAvailable) {
                System.out.println("five rupee notes: " + fiveUsed);
                System.out.println("one rupee notes: " + remaining);
                return;
            }

            fiveUsed--;
        }

        System.out.println("-1");
    }
}