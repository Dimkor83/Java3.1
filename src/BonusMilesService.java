public class BonusMilesService {
    public int calculate(int cost) {

        int rubmile = 20;
        int ticket = 20;
        int total = cost * ticket;
        boolean isRegistered = true;

        return isRegistered ? total / rubmile : 0;
    }
}
