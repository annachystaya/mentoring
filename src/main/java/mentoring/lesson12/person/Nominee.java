package mentoring.lesson12.person;

import mentoring.lesson12.award.Award;

import java.util.*;

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
