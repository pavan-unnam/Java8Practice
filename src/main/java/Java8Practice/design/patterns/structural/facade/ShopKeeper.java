package Java8Practice.design.patterns.structural.facade;

public class ShopKeeper {
	
	private MobileShop iphone;
	private MobileShop balcberry;
	
	ShopKeeper() {
		iphone = new Iphone();
		balcberry = new BlackBerry();
	}

	public void iphoneSale(){
		iphone.mobileNo();
		iphone.price();
	}
	
	public void blackBerrySale(){
		balcberry.mobileNo();
		balcberry.price();
	}
}
