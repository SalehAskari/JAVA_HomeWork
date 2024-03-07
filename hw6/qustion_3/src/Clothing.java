public abstract class Clothing {

	private String name;
	private Season season;
	private long basePrice;
	private long price;

	public Clothing(String name, Season season, long basePrice) {
		this.name = name;
		this.season = season;
		this.basePrice = basePrice;
		this.price = basePrice;
	}

	public long getPrice() {
		// TODO get price by considering discountStrategy
		return price;
	}

	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		// TODO set discountStrategy
		if (discountStrategy instanceof WinterDiscountStrategy){
			price = (new WinterDiscountStrategy().priceByDiscount(this));
		} else if (discountStrategy instanceof SummerDiscountStrategy) {
			price = (new SummerDiscountStrategy().priceByDiscount(this));
		} else if (discountStrategy instanceof YaldaDiscountStrategy) {
			price = (new YaldaDiscountStrategy().priceByDiscount(this));

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public long getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(long basePrice) {
		this.basePrice = basePrice;
	}


}
