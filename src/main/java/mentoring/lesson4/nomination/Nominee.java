package mentoring.lesson4.nomination;

import com.sun.org.apache.xpath.internal.SourceTree;
import mentoring.lesson4.award.Award;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominee {

    private String name;
    private final int nomineeAwardQuantityLimit;
    private final double nomineeAwardAmountLimit;
    private int nomineeCurrentQuantity;
    private double nomineeCurrentAmount;
    public boolean isLimitsSet;

    public Nominee(String name) {
        this.name = name;
        this.nomineeAwardQuantityLimit = 0;
        this.nomineeAwardAmountLimit = 0;
        isLimitsSet = false;
    }

    public Nominee(String name, int nomineeAwardQuantityLimit, double nomineeAwardAmountLimit){
        this.name=name;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
        isLimitsSet = true;
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



}
