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
        if (nominator1.isLimitSet()) {
            this.createNominationWithNominatorLimits(nominator1, nominee1);
        }
        if (nominee1.isLimitSet()) {
            this.createNominationWithNomineeLimits(nominator1, nominee1);
        }
        if ((!nominator1.isLimitSet()) && (!nominee1.isLimitSet())) {
            nominator1.generateNextAward();
            nominator1.nominate(nominee1);
        }

    }


    private void createNominationWithNominatorLimits(Nominator nominator1, Nominee nominee1) {
        currentAmount = 0;
        currentQuantity = 0;
        List<Award> awardsList1 = new ArrayList<Award>();
        List<Award> awardsList2 = new ArrayList<Award>();
        /*
            Nominator gives award to nominee until NominatorAwardQuantityLimit is reached
        */
        for (int quantity = 1; quantity <= nominator1.getNominatorAwardQuantityLimit(); quantity++) {
            nominator1.generateNextAward();
            nominator1.nominate(nominee1);
            awardsList1.add(nominator1.getAward());
        }
        System.out.println("Award QUANTITY Limit is reached for nominator " + nominator1.getName() + ". Quantity of given awards is " + awardsList1.size());

        /*
          Nominator gives award to recipient until NominatorAwardAmountLimit is reached
         */
        nominator1.generateNextAward();
        while (currentAmount + nominator1.getAward().getValue() < nominator1.getNominatorAwardAmountLimit()) {
            nominator1.nominate(nominee1);
            awardsList2.add(nominator1.getAward());
            currentAmount += nominator1.getAward().getValue();
            nominator1.generateNextAward();
        }
        System.out.println("Award AMOUNT Limit is reached for nominator " + nominator1.getName() + ". Quantity of given awards is " + awardsList2.size());

    }

    private void createNominationWithNomineeLimits(Nominator nominator1, Nominee nominee1) {
        int errorCode = 0;
        currentAmount = 0;
        currentQuantity = 0;
        List<Award> awardsList3 = new ArrayList<Award>();
        /*
        Nominator gives award to recipient until 1 of 2 conditions occurs: nominee Award Quantity OR Award Amount Limit is reached
         */
        nominator1.generateNextAward();
        do {
            nominator1.nominate(nominee1);
            currentQuantity++;
            currentAmount += nominator1.getAward().getValue();
            awardsList3.add(nominator1.getAward());
            nominator1.generateNextAward();
        }
        while ((currentAmount + nominator1.getAward().getValue() <= nominee1.getNomineeAwardAmountLimit()) && (currentQuantity < nominee1.getNomineeAwardQuantityLimit()));

        if (currentAmount + nominator1.getAward().getValue() > nominee1.getNomineeAwardAmountLimit()) {
            errorCode = 2;
        }
        if (currentQuantity >= nominee1.getNomineeAwardQuantityLimit()) {
            errorCode = 1;
        }
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
