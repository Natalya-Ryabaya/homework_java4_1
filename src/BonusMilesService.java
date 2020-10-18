public class BonusMilesService {
    public long calculate (int price){
        int mileOne = 20;
        int miles = price/mileOne;
        return miles;
    }
}
