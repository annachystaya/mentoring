package mentoring.lesson6;

import mentoring.lesson6.person.Nominator;
import mentoring.lesson6.person.Nominee;
import mentoring.lesson6.utils.NominationHelper;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Main {
    public static void main(String[] arg) {
        Nominator nominator1 = new Nominator("Norma Nominator", 7, 120);
        Nominee nominee1 = new Nominee("Renee Recipient1", 2, 190);
        NominationHelper nominationHelper = new NominationHelper();
        nominationHelper.createNominations(nominator1, nominee1);
        nominator1.addComments("Nominator Comment");
        nominee1.addComments("any comment");
    }
}

