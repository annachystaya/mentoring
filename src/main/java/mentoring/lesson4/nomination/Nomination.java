package mentoring.lesson4.nomination;

import com.sun.org.apache.xpath.internal.SourceTree;
import mentoring.lesson4.award.Award;

import java.util.*;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Nomination {
    public static void main(String[] arg) {
        Nominator nominator1 = new Nominator("Norma Nominator", 2, 321);
        Nominee nominee1 = new Nominee("Renee Recipient1", 5, 224.99);

        List<Award> awardsList1 = new ArrayList<Award>();
        List<Award> awardsList2 = new ArrayList<Award>();
        List<Award> awardsList3 = new ArrayList<Award>();
        Award award = new Award(100);
        int errorCode = 0;
        /*
            Nominator gives award to nominee until NominatorAwardQuantityLimit is reached
        */
        for (int quantity = 1; quantity <= nominator1.getNominatorAwardQuantityLimit(); quantity++) {

            nominator1.nominate(award, nominee1);
            awardsList1.add(award);
        }
        System.out.println("Award QUANTITY Limit is reached for nominator " + nominator1.getName() + ". Quantity of given awards is " + awardsList1.size());

        /*
        Nominator gives award to recipient until NominatorAwardAmountLimit is reached
         */
        while (nominator1.getNominatorAwardAmountLimit() >= award.getValue()) {
            nominator1.nominate(award, nominee1);
            awardsList2.add(award);
            nominator1.setNominatorAwardAmountLimit(nominator1.getNominatorAwardAmountLimit() - award.getValue());
        }
        System.out.println("Award AMOUNT Limit is reached for nominator " + nominator1.getName() + ". Quantity of given awards is " + awardsList2.size());
        System.out.println(String.format("Nominator Award Amount Limit now is %.2f", nominator1.getNominatorAwardAmountLimit()));

        /*
        Nominator gives award to recipient unitl nominee Award Quantity or Award Amount Limit is reached
         */
        do {

            if (nominee1.getNomineeAwardQuantityLimit() <= 0) {
                errorCode=1;
                break;

            } else if (nominee1.getNomineeAwardAmountLimit() < award.getValue()) {
                errorCode=2;
                break;
            } else {
                nominator1.nominate(award, nominee1);
                awardsList3.add(award);
                if (nominee1.getNomineeAwardQuantityLimit() > 0) {
                    nominee1.setNomineeAwardQuantityLimit(nominee1.getNomineeAwardQuantityLimit() - 1);
                }
                if (nominee1.getNomineeAwardAmountLimit() >= award.getValue()){
                    nominee1.setNomineeAwardAmountLimit(nominee1.getNomineeAwardAmountLimit() - award.getValue());
                }
            }
        } while ((nominee1.getNomineeAwardQuantityLimit() > 0) || (nominee1.getNomineeAwardAmountLimit() > award.getValue()));

        switch (errorCode){
            case 1:
                System.out.println("Nominee Award QUANTITY Limit is reached for nominee " + nominee1.getName() + ". Quantity of received awards is " + awardsList3.size());
                break;
            case 2:
                System.out.println("Nominee Award AMOUNT Limit is reached for nominee " + nominee1.getName() + ". Quantity of received awards is " + awardsList3.size());
                System.out.println(String.format("Nominee Award Amount Limit now is %.2f", nominee1.getNomineeAwardAmountLimit()));
                break;
            default:
                System.out.println("Something goes wrong...");
        }
   
    }

    


}

