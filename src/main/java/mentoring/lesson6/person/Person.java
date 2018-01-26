package mentoring.lesson6.person;

import java.util.List;

/**
 * Created by Anna_Chystaya on 22-Jan-18.
 */
public class Person {

    private String name;
    private final int awardQuantityLimit;
    private final double awardAmountLimit;
    private boolean limitSet;
    private int client;

    public Person (String name) {
        this.name = name;
        this.awardQuantityLimit = 0;
        this.awardAmountLimit = 0;
        limitSet = false;
    }

    public Person(String name, int awardQuantityLimit, double awardAmountLimit){
        this.name=name;
        this.awardQuantityLimit = awardQuantityLimit;
        this.awardAmountLimit = awardAmountLimit;
        limitSet = true;
    }

    public double getAwardAmountLimit() {
        return awardAmountLimit;
    }

    public int getAwardQuantityLimit() {
        return awardQuantityLimit;
    }

    public String getName() {
        return name;
    }

    public boolean isLimitSet() {
        return limitSet;
    }

    public void addComments(String comment){
        System.out.println(comment);
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }
}
