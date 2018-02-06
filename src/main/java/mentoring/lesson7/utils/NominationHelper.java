package mentoring.lesson7.utils;

import mentoring.lesson7.award.AwardService;
import mentoring.lesson7.person.Nominator;
import mentoring.lesson7.person.Nominee;
import mentoring.lesson7.award.Award;
import mentoring.lesson7.person.Person;

/**
 * class
 */
public class NominationHelper {
    private double currentAmount;
    private double currentQuantity;

    /**
     * general method for nomination creation. Behavior is different if nominee or nominator has any Limit
     *
     * @param nominator1 - person who gives award
     * @param nominee1   - person who receives award
     */
    public void createNominations(Nominator nominator1, Nominee nominee1) {
        if (nominator1.isLimitSet() || (nominee1.isLimitSet())) {
            this.createNominationWithLimits(nominator1, nominee1);
        } else {
            Award award = AwardService.createNextAward();
            nominator1.nominate(nominee1, award);
        }

    }

    /**
     * method creates nomination if any limits exist
     * @param nominator1 - person who gives award
     * @param nominee1 - person who receives award
     */
    private void createNominationWithLimits(Nominator nominator1, Nominee nominee1) {
        currentAmount = 0;
        currentQuantity = 0;
        Award award = AwardService.createNextAward();
        currentQuantity++;
        currentAmount += award.getValue();
        while (!(isAnyLimitReached(nominator1) || isAnyLimitReached(nominee1))) {
            NominationHelper.nominate(nominator1, nominee1, award);
            System.out.println("Current quantity = " + currentQuantity);
            System.out.println("Current amount = " + currentAmount);
            award = AwardService.createNextAward();
            currentQuantity++;
            currentAmount += award.getValue();
        }
        System.out.println("Next award value = " + award.getValue());
    }

    /**
     *  method just to create nomination and add it to recipient's award list (without any verification)
     * @param nominator1 - person who give award
     * @param nominee1 - person who receive award
     * @param award - award
     */
    private static void nominate(Nominator nominator1, Nominee nominee1, Award award) {
        nominee1.addAward(award);
        System.out.println(nominator1.getName() + " gives award with value " + award.getValue() + " to " + nominee1.getName());
    }

    /**
     * method to check if any Limit is reached (Amount Limit or Quantity Limit) of any Person
     * @param person - Person (nominee or nominator)
     * @return true if at least 1 limit is reached: Amount Limit or Quantity Limit, false if
     */
    private boolean isAnyLimitReached(Person person) {
        boolean isQuantityLimitReached = person.isLimitReached(currentQuantity, person.getAwardQuantityLimit());
        boolean isAmountLimitReached = person.isLimitReached(currentAmount, person.getAwardAmountLimit());
        boolean result = isQuantityLimitReached || isAmountLimitReached;
        return result;
    }


}
