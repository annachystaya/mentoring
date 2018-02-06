package mentoring.lesson7.award;

public class AwardService {

    /**
     * to generate new Award to know award value before nomination creation
     * @return new Award
     */
    public static Award createNextAward(){
        return new Award();
    }
}
