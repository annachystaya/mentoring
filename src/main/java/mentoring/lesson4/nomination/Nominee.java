package mentoring.lesson4.nomination;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominee {

    private String name;
    private final int nomineeAwardQuantityLimit;
    private final double nomineeAwardAmountLimit;
    private boolean limitSet;

    public Nominee(String name) {
        this.name = name;
        this.nomineeAwardQuantityLimit = 0;
        this.nomineeAwardAmountLimit = 0;
        limitSet = false;
    }

    public Nominee(String name, int nomineeAwardQuantityLimit, double nomineeAwardAmountLimit){
        this.name=name;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
        limitSet = true;
    }

    public double getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public String getName() {
        return name;
    }

    public boolean isLimitSet() {
        return limitSet;
    }
}
