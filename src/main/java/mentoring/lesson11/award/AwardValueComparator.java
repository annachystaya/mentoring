package mentoring.lesson11.award;

import java.util.*;

public class AwardValueComparator implements Comparator<Award> {
        public int compare(Award a1, Award a2){
            return a1.getValue().compareTo(a2.getValue());
        }
}
