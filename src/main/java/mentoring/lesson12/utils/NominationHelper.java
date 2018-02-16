package mentoring.lesson12.utils;

import mentoring.lesson12.award.AwardService;
import mentoring.lesson12.exception.LimitReachedException;
import mentoring.lesson12.person.Nominator;
import mentoring.lesson12.person.Nominee;
import mentoring.lesson12.award.Award;
import mentoring.lesson12.person.Person;

/**
 * class for working with nominations - create usual nomination, create nomination with limits
 */
public class NominationHelper {
     /**
     * general method for nomination creation. Behavior is different if nominee or nominator has any Limit
     *
     * @param nominator1 - person who gives award
     * @param nominee1   - person who receives award
     */
    public void createNominations(Person nominator1, Person nominee1) throws LimitReachedException{
        if (nominator1.isLimitSet() || (nominee1.isLimitSet())) {
            this.createNominationWithLimits(nominator1, nominee1);
        } else {
            Award award = AwardService.createNextAward();
            this.nominate(nominator1, nominee1, award);
        }

    }

    /**
     * method creates nomination if any limits exist
     * @param nominator1 - person who gives award
     * @param nominee1 - person who receives award
     */
    private void createNominationWithLimits(Person nominator1, Person nominee1) throws LimitReachedException{
        Award award = AwardService.createNextAward();
        while (!(isAnyLimitReached(nominator1, award) || isAnyLimitReached(nominee1, award))) {
            nominate(nominator1, nominee1, award);
            System.out.println("Current quantity for Nominee = " + nominee1.getCurrentQuantity());
            System.out.println("Current amount for nominee = " + nominee1.getCurrentAmount());
            System.out.println("Current quantity for Nominator = " + nominator1.getCurrentQuantity());
            System.out.println("Current amount for Nominator = " + nominator1.getCurrentAmount());
            award = AwardService.createNextAward();
        }
        System.out.println("Next award value = " + award.getValue());
        nominate(nominator1, nominee1, award);
    }

    /**
     *  method just to create nomination and add it to recipient's award list (without any verification)
     * @param nominator1 - person who give award
     * @param nominee1 - person who receive award
     * @param award - award
     */
    private void nominate (Person nominator1, Person nominee1, Award award) throws LimitReachedException{

        if ((isAnyLimitReached(nominator1, award)) || (isAnyLimitReached(nominee1, award))){

            throw new LimitReachedException("Limit is Reached Exception");
        }
        AwardService.addAwardForNominee(nominee1, award);
        nominator1.setCurrentQuantity(nominator1.getCurrentQuantity() + 1);
        nominator1.setCurrentAmount(nominator1.getCurrentAmount() + award.getValue());
        nominee1.setCurrentQuantity(nominee1.getCurrentQuantity() + 1);
        nominee1.setCurrentAmount(nominee1.getCurrentAmount() + award.getValue());
        System.out.println(nominator1.getName() + " gives award with value " + award.getValue() + " to " + nominee1.getName());

    }

    /**
     * method to check if any Limit is reached (Amount Limit or Quantity Limit) of any Person
     * @param person - Person (nominee or nominator)
     * @return true if at least 1 limit is reached: Amount Limit or Quantity Limit, false if
     */

    private boolean isAnyLimitReached(Person person, Award award) {
        boolean isQuantityLimitReached = person.isLimitReached(person.getCurrentQuantity() + 1, person.getAwardQuantityLimit());
        boolean isAmountLimitReached = person.isLimitReached(person.getCurrentAmount() + award.getValue(), person.getAwardAmountLimit());
        boolean result = isQuantityLimitReached || isAmountLimitReached;
        return result;
    }


}
