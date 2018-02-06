package mentoring.lesson7.person;

import mentoring.lesson7.award.Award;

import java.util.*;

public class Nominee extends Person {
    private List<Award> awardsList;

    public Nominee(String name) {
        super(name);
        awardsList = new ArrayList<Award>();
    }

    public Nominee(String name, int awardQuantityLimit, double awardAmountLimit){
        super(name, awardQuantityLimit, awardAmountLimit);
        awardsList = new ArrayList<Award>();
    }

    @Override
    public void addComments(String comment) {
        super.addComments(comment);
        System.out.println("As nominee I want to thank you!");
    }

    /**
     * method to add award for recipient to recipient's award list
     * @param award - created award
     */
    public void addAward(Award award){
        awardsList.add(award);
    }
}
