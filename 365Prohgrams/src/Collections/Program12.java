package Collections;
import java.util.*;

enum Day { MON, TUE, WED }

class Program12 {
    public static void main(String[] args) {
        EnumSet<Day> set = EnumSet.allOf(Day.class);

        set.remove(Day.TUE);

        for(Day d : set) {
            System.out.println(d);
        }
    }
}
