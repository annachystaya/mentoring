package mentoring.lesson4.award;

import java.util.Random;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Award {

    private final int value;

    public Award() {
        Random rand = new Random();
        int value = rand.nextInt(100);
        this.value = value;
    }

    public Award(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
