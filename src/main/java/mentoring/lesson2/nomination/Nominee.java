package mentoring.lesson2.nomination;

import mentoring.lesson2.award.Award;

import java.util.*;

/**
 * Created by Anna_Chystaya on 14-Dec-17.
 */
public class Nominee {

    private String name;
    private Double quantity;
    private int population; //total count of employee's awards without soli

    static {
        System.out.println("Nominee class is initiated");
    }

    public Nominee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * method calculated Award value.
     * If SOLI is defined then Award value is calculated using SOLI. then we inform user if value was decresed or increased and how much.
     * If SOLI is not defined, Award Value is not re-calculated and used as it is.
     *
     * @param award
     */

    public void receiveAward(Award award) {
        if (award.isSoliSet()) {
            award.setActualValue(award.getValue() * award.getSoli());
            System.out.println("SOLI is used for Award " + award.getSoli());
            if (award.getSoli() > 1) {
                System.out.println(String.format("Award value is increased for %.2f percentages", (award.getSoli() - 1) * 100));
            } else if (award.getSoli() < 1) {
                System.out.println(String.format("Award value is decreased for %.2f percentages", (1 - award.getSoli()) * 100));
            } else {
                System.out.println("Award value is not changed.");
            }
        } else {
            award.setActualValue(award.getValue());
            population++;
            System.out.println("SOLI is NOT applied to Award. Population for nominee " + this.name + " is increased and now it = " + population);
            this.quantity = this.calculateQuantityForNominee(award);
        }
        System.out.println(this.getName() + " received award with value " + award.getActualValue());
    }

    public double calculateQuantityForNominee(Award award) {
        System.out.println("calculating Quantity for nominee " + this.name + " for Award with value " + award.getActualValue());
        double param = this.calculateParamForQuantity(award);
        System.out.println("Param = " + param);

        if (population != 0) {
            double quantity = param / (1 + ((param - 1) / population));
        } else System.out.println("Division by zero!");
        System.out.println("Quantity = " + quantity);
        return quantity;
    }

    private double calculateParamForQuantity(Award award) {
        Random rand = new Random();
        int z = rand.nextInt(1000);
        double param=0;
        Double c = rand.nextDouble();
        System.out.println("Z = " + z);
        System.out.println("C = " + c);
        if (Double.compare (c,0.00) != 0) {
            double z2 = Math.pow(z, 2.0);
            double c2 = Math.pow(c, 2.0);
            param = (z2 * award.getActualValue() * (1 - award.getActualValue())) / c2;

        } else {
            System.out.println("Division by zero");
        }
        return param;
    }

}
