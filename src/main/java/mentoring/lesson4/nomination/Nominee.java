package mentoring.lesson4.nomination;

import com.sun.org.apache.xpath.internal.SourceTree;
import mentoring.lesson4.award.Award;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominee {

    private String name;
    private int nomineeAwardQuantityLimit;
    private double nomineeAwardAmountLimit;

    public Nominee(String name) {
        this.name = name;
    }

    public Nominee(String name, int nomineeAwardQuantityLimit, double nomineeAwardAmountLimit){
        this.name=name;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public double getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public void setNomineeAwardAmountLimit(double nomineeAwardAmountLimit) {
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public String getName() {
        return name;
    }

    public void receiveAward(Award award){
        System.out.println(this.getName() + " received award with value " + award.getValue());
    }


}
