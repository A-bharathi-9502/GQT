package SwingExample;

import java.util.Random;

public class LifeLines {

    public static boolean audienceUsed = false;
    public static boolean fiftyUsed = false;

    public static void fiftyFifty(String[] options, char correct) {
        int removed = 0;
        Random r = new Random();

        while (removed < 2) {
            int i = r.nextInt(4);
            if (options[i].length() != 0 && (char)('a' + i) != correct) {
                options[i] = "";
                removed++;
            }
        }
    }
}
