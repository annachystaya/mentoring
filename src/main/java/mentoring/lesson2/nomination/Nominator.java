package mentoring.lesson2.nomination;
import mentoring.lesson2.award.Award;
/**
 * Created by Anna_Chystaya on 14-Dec-17.
 */
public class Nominator {

    private String name;

    static {
        System.out.println("Nominator class is initiated");
    }

    public Nominator (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void nominate(Award award,Nominee nominee){
        System.out.println(this.getName() + " gives award with value " + award.getValue() + " to " + nominee.getName());
    }
}
