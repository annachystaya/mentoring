package mentoring.lesson7.person;
import mentoring.lesson7.award.Award;

public class Nominator extends Person {

    public Nominator(String name){
       super(name);
    }

    public Nominator(String name, int awardQuantityLimit, double awardAmountLimit ){
        super(name, awardQuantityLimit, awardAmountLimit);
    }

    @Override
    public void addComments(String comment) {
        System.out.println("as Nominator I want to say: " + comment);
    }
}
