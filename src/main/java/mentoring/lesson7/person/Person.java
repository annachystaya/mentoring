package mentoring.lesson7.person;

import mentoring.lesson7.common.OperationsWithLimits;

import java.util.List;

public abstract class Person implements OperationsWithLimits {

    private String name;
    private final int awardQuantityLimit;
    private final double awardAmountLimit;
    private boolean limitSet;
    private int client;

    /**
     * method to check if Limit is reached or not
     * @param currentValue - current value of Limited parameter
     * @param finalLimit - final Limit of parameter
     * @return true if Limit is reached, false if Limit is not reached yet
     */
    public boolean isLimitReached(double currentValue, double finalLimit) {
        if (finalLimit < currentValue) {
            System.out.println("Limit is reached");
            return true;
        } else return false;
    }

    public Person(String name) {
        this.name = name;
        this.awardQuantityLimit = 0;
        this.awardAmountLimit = 0;
        limitSet = false;
    }

    public Person(String name, int awardQuantityLimit, double awardAmountLimit) {
        this.name = name;
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

    /**
     * Person can add comment
     * @param comment
     */
    public void addComments(String comment) {
        System.out.println(comment);
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }
}
