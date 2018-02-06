package mentoring.lesson7.person;
import mentoring.lesson7.award.Award;

public class Nominator extends Person {

    /**
     * method created nomination for nominee for generated Award
     *
     * @param nominee - nominee is person who receives the Award
     * @param award - Award that nominator gives to nominee
     */
    public void nominate(Nominee nominee, Award award){

    }

    public Nominator(String name){
       super(name);
    }

    public Nominator(String name, int awardQuantityLimit, double awardAmountLimit ){
        super(name, awardQuantityLimit, awardAmountLimit);
    }


}
