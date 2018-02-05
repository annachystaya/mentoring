package mentoring.lesson7.utils;

import mentoring.lesson7.award.AwardService;
import mentoring.lesson7.person.Nominator;
import mentoring.lesson7.person.Nominee;
import mentoring.lesson7.award.Award;
import mentoring.lesson7.person.Person;

public class NominationHelper {
    private double currentAmount;
    private double currentQuantity;

    /**
     * general method for nomination creation
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

    private static void nominate(Nominator nominator1, Nominee nominee1, Award award) {
        nominee1.addAward(award);
        System.out.println(nominator1.getName() + " gives award with value " + award.getValue() + " to " + nominee1.getName());
    }

    private boolean isAnyLimitReached(Person person) {
        boolean isQuantityLimitReached = person.isLimitReached(currentQuantity, person.getAwardQuantityLimit());
        boolean isAmountLimitReached = person.isLimitReached(currentAmount, person.getAwardAmountLimit());
        boolean result = isQuantityLimitReached || isAmountLimitReached;
        return result;
    }


}
