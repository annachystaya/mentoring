package mentoring.lesson11.award;

import java.util.Comparator;
import java.util.Random;

public class Award {

    private final Integer value;
    private String type;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Award)) return false;

        Award award = (Award) o;

        if (getValue() != award.getValue()) return false;
        return getType().equals(award.getType());
    }

    @Override
    public int hashCode() {
        int result = getValue();
        result = 31 * result + getType().hashCode();
        return result;
    }

    public Award() {
        Random rand = new Random();

        int value = rand.nextInt(100);
        this.value = value;
        this.type = "Default Award";
        this.id = rand.nextInt(1000000);
    }

    public Award(int value) {
        this.value = value;
        this.type = "Default Award";
        Random rand = new Random();
        this.id = rand.nextInt(1000000);
    }

    public Award(int value, String type){
        this.value = value;
        this.type = type;
        Random rand = new Random();
        this.id = rand.nextInt(1000000);
    }

    public Integer getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Award{" +
                "value=" + value +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}


