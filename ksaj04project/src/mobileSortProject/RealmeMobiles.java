package mobileSortProject;

public class RealmeMobiles {
	String name;
	int Ram;
	int Rom;
	int Frontcamera;
	int Battery;
	int positivereview_5$;
	int negativereview_1$;
	int price;
	public RealmeMobiles(String name, int ram, int rom, int frontcamera, int battery,int positivereview_5$,
	int negativereview_1$,int price) {

		this.name = name;
		this.Ram = ram;
		this.Rom = rom;
		this.Frontcamera = frontcamera;
		this.Battery = battery;
		this.positivereview_5$=positivereview_5$;
		this.negativereview_1$=negativereview_1$;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "RealmeMobiles [name=" + name+"  , Ram=" + Ram + ", Rom=" + Rom + ", Frontcamera=" + Frontcamera
				+ ", Battery=" + Battery + ", positivereview_5$=" + positivereview_5$ + ", negativereview_1$="
				+ negativereview_1$ + ", price=" + price + "]";
	}
	
	

}
