//روش سفر با دوچرخه
public class BikeTripMethod implements TripMethod{
    @Override
    public int calcPrice(TripParam params) {
        int temp = 4000 * DistanceMap.distance[params.getSource()][params.getDestination()];
        if (params.isPeakTime() == true && params.isRainy() == true){
            return (int)(temp * 1.5);
        } else if (params.isPeakTime() == true) {
            return temp * 2;
        } else if (params.isRainy() == true) {
            return (int)(temp * .8);
        }
        return temp;
    }
}
