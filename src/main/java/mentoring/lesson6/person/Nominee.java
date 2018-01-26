package mentoring.lesson6.person;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nominee extends Person {

    public Nominee(String name) {
        super(name);
    }

    public Nominee(String name, int awardQuantityLimit, double awardAmountLimit){
        super(name, awardQuantityLimit, awardAmountLimit);
    }

    @Override
    public void addComments(String comment) {
        super.addComments(comment);
        System.out.println("As nominee I want to thank you!");
    }
}
