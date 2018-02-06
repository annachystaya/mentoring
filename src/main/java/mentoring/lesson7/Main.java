package mentoring.lesson7;

import mentoring.lesson7.person.Nominator;
import mentoring.lesson7.person.Nominee;
import mentoring.lesson7.utils.NominationHelper;

public class Main {
    public static void main(String[] arg) {
        Nominator nominator1 = new Nominator("Norma Nominator", 7, 100);
        Nominee nominee1 = new Nominee("Renee Recipient1", 5, 300);
        NominationHelper nominationHelper = new NominationHelper();
        nominationHelper.createNominations(nominator1, nominee1);
        nominator1.addComments("Nominator Comment");
        nominee1.addComments("Nominee comment");
    }
}

