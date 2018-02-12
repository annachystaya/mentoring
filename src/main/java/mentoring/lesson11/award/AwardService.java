package mentoring.lesson11.award;

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

    /**
     * method to print awards from List of defined Type only
     * @param awardsList - List of awards
     * @param type - award of this type only will be printed
     */
    public static void printAwardsOfType(List<Award> awardsList, String type) {
        for (Award award : awardsList) {
            if (award.getType().equals(type)){
                System.out.println(award);
            }
        }
        System.out.println("");
    }

    /**
     * method to print all awards from awardList
     * @param awardList - List of awards
     */
    public static void printAllAwardsFromList(List<Award> awardList){
        for (Award award: awardList){
            System.out.println(award);
        }
    }

    /**
     * method to print all unique award types from the list of awards
     * @param awardList - list of awards
     */
    public static void printAllUniqueAwardTypes(List<Award> awardList){
        Set<String> awardTypesSet = new HashSet<String>();
        for (Award award: awardList){
            awardTypesSet.add(award.getType());
        }
        for (String type: awardTypesSet) {
            System.out.println(type + " ");
        }
    }

    /**
     * method to print all uniques awards. Award ID is not taking into account as its always unique
     * @param awardList
     */
    public static void printAllUniqueAwards(List<Award> awardList){
        Set<Award> awardSet = new HashSet<Award>();
        for (Award award: awardList){
            awardSet.add(award);
        }
        for (Award award: awardSet){
            System.out.println(award);
        }
    }



}
