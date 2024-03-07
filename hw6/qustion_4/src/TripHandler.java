//راهنمای سفر
public class TripHandler {
	private static TripHandler instance;

	public int calcPrice(String type, TripParam params) {
		if (type.equals("vip")){
			return new VipTripMethod().calcPrice(params);

		} else if (type.equals("bike")) {
			return new BikeTripMethod().calcPrice(params);

		} else if (type.equals("economic")) {
			return new EconomicTripMethod().calcPrice(params);
		}
		return 0;
	}
	public static TripHandler getInstance(){
		if (instance == null){
			instance = new TripHandler();
		}
		return instance;
	}

}
