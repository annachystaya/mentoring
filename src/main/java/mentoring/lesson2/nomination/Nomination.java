package mentoring.lesson2.nomination;

import mentoring.lesson2.award.Award;

/**
 * Created by Anna_Chystaya on 14-Dec-17.
 */
public class Nomination {
    //bla-bla-bla
    public static void main(String[] arg){
        Award award1 = new Award(100);
        Nominator nominator1 = new Nominator("Norma Nominator");
        Nominee nominee1 = new Nominee("Richie Recipient");

        nominator1.nominate(award1, nominee1);
        nominee1.receiveAward(award1);

        System.out.println();
        Award award2 = new Award(1000, 0.8);
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
        Award award4 = new Award(1000, 1.0);
        Nominator nominator4 = new Nominator("Mandy Manager");
        Nominee nominee4 = new Nominee ("Renee Recipient");

        nominator4.nominate(award4, nominee4);
        nominee4.receiveAward(award4);

        System.out.println();
        nominee1.receiveAward(award3);
        nominee1.receiveAward(award2);
        nominee1.receiveAward(award1);


//        nominee1.calculateQuantityForNominee(award1);
//        nominee2.calculateQuantityForNominee(award2);
//        nominee3.calculateQuantityForNominee(award3);
//        nominee4.calculateQuantityForNominee(award4);

    }
}
