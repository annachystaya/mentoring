package mentoring.lesson11.award;

import java.util.*;

public class AwardTypeComparator implements Comparator<Award> {
    public int compare(Award a1, Award a2){
        return a1.getType().compareTo(a2.getType());
    }
}