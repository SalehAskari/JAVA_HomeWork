public class SummerDiscountStrategy implements DiscountStrategy{
    @Override
    public long priceByDiscount(Clothing clothing) {

        if (clothing.getSeason() == Season.SPRING){
            return (long) (clothing.getBasePrice() * 0.6);

        } else if (clothing.getSeason() == Season.SUMMER) {
            return (long) (clothing.getBasePrice() * 0.5);
            
        } else if (clothing.getSeason() == Season.WINTER) {
            return (long) (clothing.getBasePrice() * 0.7);
            
        }
        return clothing.getBasePrice();
    }
}
