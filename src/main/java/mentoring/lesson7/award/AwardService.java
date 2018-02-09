package mentoring.lesson7.award;

import mentoring.lesson7.person.Person;

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


    //добавить хэшмэп номинии-лист авард и метод для добавления пары в хэш мапу (гет по ключу и потом адд в лист
    public static HashMap<Person, ArrayList<Award>> awardsForNomineeMap = new HashMap<Person, ArrayList<Award>>();


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
