package mentoring.lesson4.nomination;
import mentoring.lesson4.award.Award;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominator {

    private String name;
    private final int nominatorAwardQuantityLimit;
    private final double nominatorAwardAmountLimit;
    private int nominatorCurrentQuantity;
    private double nominatorCurrentAmount;
    public boolean isLimitsSet;

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

   public Nominator(String name){
       this.name=name;
       this.nominatorAwardAmountLimit=0;
       this.nominatorAwardQuantityLimit=0;
       isLimitsSet = false;
    }

    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorAwardAmountLimit ){
        this.name=name;
        this.nominatorAwardAmountLimit=nominatorAwardAmountLimit;
        this.nominatorAwardQuantityLimit=nominatorAwardQuantityLimit;
        isLimitsSet = true;
    }

    /*
    method
     */
    public Award nominate(Nominee nominee){
        Award award = new Award();
        System.out.println(this.getName() + " gives award with value " + award.getValue() + " to " + nominee.getName());
        return award;
    }


}
