package mentoring.lesson4.nomination;
import mentoring.lesson4.award.Award;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominator {

    private String name;
    private final int nominatorAwardQuantityLimit;
    private final double nominatorAwardAmountLimit;
    private boolean limitSet;
    private Award award;

    /*
    method to generate Award for next nomination to know Award Value for the next nomination
     */
    public void generateNextAward(){
        this.award = new Award();
    }

    /*
    method created nomination for nominee for generated Award
     */
    public void nominate(Nominee nominee){
        System.out.println(this.getName() + " gives award with value " + award.getValue() + " to " + nominee.getName());
    }
    /*
    Getters, Setters and Constructors
     */
    public String getName() {
        return name;
    }

    public double getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public int getNominatorAwardQuantityLimit() {

        return nominatorAwardQuantityLimit;
    }

    public boolean isLimitSet() {
        return limitSet;
    }

    public Award getAward() {
        return award;
    }

    public Nominator(String name){
        this.name=name;
        this.nominatorAwardAmountLimit=0;
        this.nominatorAwardQuantityLimit=0;
        limitSet = false;
    }

    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorAwardAmountLimit ){
        this.name=name;
        this.nominatorAwardAmountLimit=nominatorAwardAmountLimit;
        this.nominatorAwardQuantityLimit=nominatorAwardQuantityLimit;
        limitSet = true;
    }


}
