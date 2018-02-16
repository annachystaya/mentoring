package mentoring.lesson12;

import mentoring.lesson12.award.AwardService;
import mentoring.lesson12.exception.LimitReachedException;
import mentoring.lesson12.person.Nominator;
import mentoring.lesson12.person.Nominee;
import mentoring.lesson12.person.Person;
import mentoring.lesson12.utils.NominationHelper;

public class Main {
    public static void main(String[] arg) {
        Person nominator1 = new Nominator("Norma Nominator", 7, 500);
        Person nominee1 = new Nominee("Renee Recipient1", 5, 300);
        Person nominee2 = new Nominee("Rebecca Recipient2", 5, 300);
        NominationHelper nominationHelper = new NominationHelper();
        try {
            nominationHelper.createNominations(nominator1, nominee1);
            nominationHelper.createNominations(nominator1, nominee2);
        } catch (LimitReachedException e){
            System.out.println("EXCEPTION!!!! Limit is reached. Nomination cannot be created.");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hello to All!!! I'm finally!");
        }
        nominator1.addComments("Nominator Comment");
        nominator1.addComments("Enjoy your award!", AwardService.createNextAward());
        nominee1.addComments("Nominee comment");


    }
}

