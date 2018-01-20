package mentoring.lesson4;

import com.sun.org.apache.xpath.internal.SourceTree;
import mentoring.lesson4.award.Award;
import mentoring.lesson4.nomination.Nominator;
import mentoring.lesson4.nomination.Nominee;
import mentoring.lesson4.utils.NominationHelper;

import java.util.*;

/**
 * Created by Anna_Chystaya on 04-Jan-18.
 */
public class Main {
    public static void main(String[] arg) {
        Nominator nominator1 = new Nominator("Norma Nominator", 7, 120);
        Nominee nominee1 = new Nominee("Renee Recipient1", 2, 190);
        NominationHelper nominationHelper = new NominationHelper();
        nominationHelper.createNominations(nominator1, nominee1);
    }
}

