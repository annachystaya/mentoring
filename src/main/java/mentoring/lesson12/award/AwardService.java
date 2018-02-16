package mentoring.lesson12.award;

import mentoring.lesson12.person.Person;

import java.util.*;

public class AwardService {

    /**
     * to generate new Award to know award value before nomination creation
     *
     * @return new Award
     */
    public static Award createNextAward() {
        return new Award();
    }


    //HashMap stores List of Awards received by each nominee
    public static HashMap<Person, ArrayList<Award>> awardsForNomineeMap = new HashMap<Person, ArrayList<Award>>();

    /**
     * method to add Award to award List for each nominee in Hash Map
     * @param nominee - person who received award (key in Hash Map)
     * @param award - received award to be added to Hash Map
     */
    public static void addAwardForNominee(Person nominee, Award award) {
        if (awardsForNomineeMap.containsKey(nominee)) {
            awardsForNomineeMap.get(nominee).add(award);
        } else {
            ArrayList<Award> tempAwardList = new ArrayList<Award>();
            tempAwardList.add(award);
            awardsForNomineeMap.put(nominee, tempAwardList);
        }
    }

}
