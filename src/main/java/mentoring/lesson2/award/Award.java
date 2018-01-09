package mentoring.lesson2.award;

/**
 * Created by Anna_Chystaya on 14-Dec-17.
 */
public final class Award {

    private final int value;
    private Double soli;
    private double actualValue;
    private static final String MESSAGE = "Award class is initiated";

    static {
        System.out.println(MESSAGE);
    }

    public Award(int value, Double soli) {
        this.value = value;
        this.soli=soli;
    }

    public Award(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Double getSoli() {
        return soli;
    }

    public void setSoli(Double soli) {
        this.soli = soli;
    }

    public double getActualValue() {
        return actualValue;
    }

    public void setActualValue(double actualValue) {
        this.actualValue = actualValue;
    }

    public boolean isSoliSet() {
        return (this.soli!= null);
    }
}

