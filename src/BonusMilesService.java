public class BonusMilesService {
    public int calculate(int cost) {

        int rubmile = 20;
        int ticket = 10;
        int total = cost * ticket;
        boolean isRegistered = true;

        int miles = isRegistered ? total / rubmile : 0;
//        int limit = 500;
//        if (miles > limit) {
//            miles = limit;
//        }
        return miles;
    }
}
