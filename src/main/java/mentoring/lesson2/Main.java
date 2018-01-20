package mentoring.lesson2;

import mentoring.lesson2.award.Award;
import mentoring.lesson2.nomination.Nominator;
import mentoring.lesson2.nomination.Nominee;

/**
 * Created by Anna_Chystaya on 14-Dec-17.
 */
public class Main {
    //bla-bla-bla
    public static void main(String[] arg){
        Award award1 = new Award(100);
        Nominator nominator1 = new Nominator("Norma Nominator");
        Nominee nominee1 = new Nominee("Richie Recipient");

        nominator1.nominate(award1, nominee1);
        nominee1.receiveAward(award1);

        System.out.println();
        Award award2 = new Award(1000);
        Nominator nominator2 = new Nominator("Mandy Manager");
        Nominee nominee2 = new Nominee ("Rebecca Recipient");

        nominator2.nominate(award2, nominee2);
        nominee2.receiveAward(award2);

        System.out.println();
        Award award3 = new Award(1000, 1.5);
        Nominator nominator3 = new Nominator("Mandy Manager");
        Nominee nominee3 = new Nominee ("Renee Recipient");

        nominator3.nominate(award3, nominee3);
        nominee3.receiveAward(award3);

        System.out.println();
        Award award4 = new Award(1000, 0.8);
        Nominator nominator4 = new Nominator("Mandy Manager");
        Nominee nominee4 = new Nominee ("Renee Recipient");

        nominator4.nominate(award4, nominee4);
        nominee4.receiveAward(award4);

        System.out.println();
        nominee1.receiveAward(award3);
        nominee1.receiveAward(award2);
        nominee1.receiveAward(award1);


        nominee1.calculateQuantityForNominee(award1);
        nominee2.calculateQuantityForNominee(award2);

        if (nominee1.getQuantity() > nominee2.getQuantity()) {
            System.out.println("Quantity of " + nominee1.getName() + " is greater than quantity of " + nominee2.getName());
        } else {
            System.out.println("Quantity of " + nominee1.getName() + " is less than quantity of " + nominee2.getName());
        }

    }
}
