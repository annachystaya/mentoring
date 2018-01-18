package mentoring.lesson4.utils;

import mentoring.lesson4.nomination.Nominator;
import mentoring.lesson4.nomination.Nominee;
import mentoring.lesson4.award.Award;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna_Chystaya on 12-Jan-18.
 */
public class NominationHelper {
    private double currentAmount;
    private double currentQuantity;

    /*

     */
    public void createNominations(Nominator nominator1, Nominee nominee1) {
        if (nominator1.isLimitsSet) { this.createNominationWithNominatorLimits(nominator1, nominee1);}
        if (nominee1.isLimitsSet) {this.createNominationWithNomineeLimits(nominator1, nominee1);}
        if ((!nominator1.isLimitsSet) && (!nominee1.isLimitsSet)) nominator1.nominate(nominee1);

    }


    private void createNominationWithNominatorLimits(Nominator nominator1, Nominee nominee1) {


        List<Award> awardsList1 = new ArrayList<Award>();
        List<Award> awardsList2 = new ArrayList<Award>();
        /*
            Nominator gives award to nominee until NominatorAwardQuantityLimit is reached
        */
        for (int quantity = 1; quantity <= nominator1.getNominatorAwardQuantityLimit(); quantity++) {
            Award award = nominator1.nominate(nominee1);
            awardsList1.add(award);
        }
        System.out.println("Award QUANTITY Limit is reached for nominator " + nominator1.getName() + ". Quantity of given awards is " + awardsList1.size());

    /*
    Nominator gives award to recipient until NominatorAwardAmountLimit is reached
     */

        while (currentAmount <= nominator1.getNominatorAwardAmountLimit()) {
            Award award = nominator1.nominate(nominee1);
            awardsList2.add(award);
            currentAmount = currentAmount + award.getValue();
        }
        System.out.println("Award AMOUNT Limit is reached for nominator " + nominator1.getName() + ". Quantity of given awards is " + awardsList2.size());

    }

    private void createNominationWithNomineeLimits(Nominator nominator1, Nominee nominee1) {

        List<Award> awardsList3 = new ArrayList<Award>();
        int errorCode = 0;

        /*
        Nominator gives award to recipient unitl nominee Award Quantity or Award Amount Limit is reached
         */

        do {
            Award award = nominator1.nominate(nominee1);
            currentQuantity++;
            currentAmount += award.getValue();
            if (currentAmount > nominee1.getNomineeAwardAmountLimit()) {
                errorCode = 2;
                break;

            } else if (currentQuantity > nominee1.getNomineeAwardQuantityLimit()) {
                errorCode = 1;
                break;
            } else {
                awardsList3.add(award);
            }
        }
        while ((currentQuantity <= nominee1.getNomineeAwardQuantityLimit()) || (currentAmount <= nominee1.getNomineeAwardAmountLimit()));

        switch (errorCode) {
            case 1:
                System.out.println("Nominee Award QUANTITY Limit is reached for nominee " + nominee1.getName() + ". Quantity of received awards is " + awardsList3.size());
                break;
            case 2:
                System.out.println("Nominee Award AMOUNT Limit is reached for nominee " + nominee1.getName() + ". Quantity of received awards is " + awardsList3.size());
                break;
            default:
                System.out.println("Something goes wrong...");
        }
    }
}
