package mentoring.lesson7.award;

import java.util.Random;

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
