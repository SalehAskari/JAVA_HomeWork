public class WinterDiscountStrategy implements DiscountStrategy{
    @Override
    public long priceByDiscount(Clothing clothing) {
        long temp = 0;
        if (clothing.getSeason() == Season.FALL){
            temp = (long) (clothing.getPrice() * 0.6);
        } else if (clothing.getSeason() == Season.WINTER) {
            temp = (long) (clothing.getBasePrice() * 0.5);
        } else if (clothing.getSeason() == Season.SUMMER) {
            temp = (long) (clothing.getBasePrice() * 0.75);
        }
        if (clothing instanceof Jacket){
            return (long) (temp * 0.9);
        }
        return temp;
    }
}
