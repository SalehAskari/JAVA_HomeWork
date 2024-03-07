//روش سفر اقتصادی
public class EconomicTripMethod implements TripMethod{
    @Override
    public int calcPrice(TripParam params) {

        int temp = 5000 * DistanceMap.distance[params.getSource()][params.getDestination()];
        if (params.isPeakTime() == true && params.isRainy() == true){
            return (int)(temp * 1.4);
        } else if (params.isPeakTime() == true || params.isRainy() == true) {
            return (int)(temp * 1.2);
        }
        return temp;
    }
}
