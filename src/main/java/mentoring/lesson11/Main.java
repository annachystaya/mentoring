package mentoring.lesson11;

import mentoring.lesson11.award.Award;
import mentoring.lesson11.award.AwardService;
import mentoring.lesson11.award.AwardTypeComparator;
import mentoring.lesson11.award.AwardValueComparator;
import java.util.*;

public class Main {
    public static void main(String[] arg) {

        List<Award> awardList = new ArrayList<Award>();

        awardList.add(new Award(150,"Gold Award"));
        awardList.add(new Award(100,"Silver Award"));
        awardList.add(new Award(51, "Bronze Award"));
        awardList.add(new Award(151,"Gold Award"));
        awardList.add(new Award(202,"Platinum Award"));
        awardList.add(new Award(150,"Gold Award"));
        awardList.add(new Award(120,"Silver Award"));
        awardList.add(new Award(54, "Bronze Award"));
        awardList.add(new Award(102,"Silver Award"));
        awardList.add(new Award(50,"Bronze Award"));
        awardList.add(new Award(50,"Bronze Award"));
        awardList.add(new Award(50,"Bronze Award"));
        awardList.add(new Award(105,"Silver Award"));
        awardList.add(new Award(207,"Platinum Award"));
        awardList.add(new Award(500,"Mega Super Award"));

        //sort

        Comparator<Award> awardComparator = new AwardTypeComparator().thenComparing(new AwardValueComparator());
        Collections.sort(awardList,awardComparator);
        //awardList.sort(awardComparator);

        AwardService.printAllAwardsFromList(awardList);
        System.out.println("");
        AwardService.printAwardsOfType(awardList,"Bronze Award");
        AwardService.printAwardsOfType(awardList,"Silver Award");
        AwardService.printAwardsOfType(awardList,"Gold Award");
        AwardService.printAwardsOfType(awardList,"Platinum Award");
        AwardService.printAwardsOfType(awardList,"Mega Super Award");

        AwardService.printAllUniqueAwardTypes(awardList);
        AwardService.printAllUniqueAwards(awardList);













    }
}

