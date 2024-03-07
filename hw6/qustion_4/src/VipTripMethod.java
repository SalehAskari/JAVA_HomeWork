// سفر vip
public class VipTripMethod implements TripMethod{
    @Override
    public int calcPrice(TripParam params) {

        int temp = 10000 * DistanceMap.distance[params.getSource()][params.getDestination()];

        if (params.isPeakTime() == true && params.isRainy() == true){
            return temp * 3;
        } else if (params.isPeakTime() == true || params.isRainy() == true) {
            return temp * 2;
        }
        return 10000;
    }
}
