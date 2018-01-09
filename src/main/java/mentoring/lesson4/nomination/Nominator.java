package mentoring.lesson4.nomination;
import mentoring.lesson4.award.Award;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominator {

    private String name;
    private int nominatorAwardQuantityLimit;
    private double nominatorAwardAmountLimit;

    /*
    Getters, Setters and Constructors
     */
    public String getName() {
        return name;
    }

    public double getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(double nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public int getNominatorAwardQuantityLimit() {

        return nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public Nominator(String name){
        this.name=name;
    }

    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorAwardAmountLimit ){
        this.name=name;
        this.nominatorAwardAmountLimit=nominatorAwardAmountLimit;
        this.nominatorAwardQuantityLimit=nominatorAwardQuantityLimit;
    }

    /*
    method
     */
    public void nominate(Award award,Nominee nominee){
        System.out.println(this.getName() + " gives award with value " + award.getValue() + " to " + nominee.getName());
    }


}
