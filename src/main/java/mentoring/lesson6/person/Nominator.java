package mentoring.lesson6.person;
import mentoring.lesson6.award.Award;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominator extends Person {

    private Award award;

    /*
    method to generate Award for next person to know Award Value for the next person
     */
    public void generateNextAward(){
        this.award = new Award();
    }
    /*
    method created person for nominee for generated Award
     */
    public void nominate(Nominee nominee){
        System.out.println(this.getName() + " gives award with value " + award.getValue() + " to " + nominee.getName());
    }
    /*
    Getters, Setters and Constructors
     */
    public Award getAward() {
        return award;
    }

    public Nominator(String name){
       super(name);
    }

    public Nominator(String name, int awardQuantityLimit, double awardAmountLimit ){
        super(name, awardQuantityLimit, awardAmountLimit);
    }


}
