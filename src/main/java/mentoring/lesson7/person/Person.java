package mentoring.lesson7.person;

import mentoring.lesson7.award.Award;
import mentoring.lesson7.common.OperationsWithLimits;

import java.util.List;

public abstract class Person implements OperationsWithLimits {

    private String name;
    private final int awardQuantityLimit;
    private final double awardAmountLimit;
    private boolean limitSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (awardQuantityLimit != person.awardQuantityLimit) return false;
        if (Double.compare(person.awardAmountLimit, awardAmountLimit) != 0) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + awardQuantityLimit;
        temp = Double.doubleToLongBits(awardAmountLimit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

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

    /**
     * Person can add comment
     * @param comment - text to be added as a comment
     */
    public void addComments(String comment) {
        System.out.println(comment);
    }

    /**
     * overloaded method to add comments for the award
     * @param comment - String comment to be added to the award
     * @param award - award to be commented
     */
    public void addComments(String comment, Award award){
        System.out.println("Text '"+ comment + "' was added as a comment to " + award);
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

}
