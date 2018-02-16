package mentoring.lesson12.person;
import mentoring.lesson12.award.Award;

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
