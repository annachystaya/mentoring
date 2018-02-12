package mentoring.lesson7;

import mentoring.lesson7.award.AwardService;
import mentoring.lesson7.person.Nominator;
import mentoring.lesson7.person.Nominee;
import mentoring.lesson7.person.Person;
import mentoring.lesson7.utils.NominationHelper;

public class Main {
    public static void main(String[] arg) {
        Person nominator1 = new Nominator("Norma Nominator", 7, 500);
        Person nominee1 = new Nominee("Renee Recipient1", 5, 300);
        Person nominee2 = new Nominee("Rebecca Recipient2", 5, 300);
        NominationHelper nominationHelper = new NominationHelper();
        nominationHelper.createNominations(nominator1, nominee1);
        nominationHelper.createNominations(nominator1, nominee2);
        nominator1.addComments("Nominator Comment");
        nominator1.addComments("Enjoy your award!", AwardService.createNextAward());
        nominee1.addComments("Nominee comment");


    }
}

