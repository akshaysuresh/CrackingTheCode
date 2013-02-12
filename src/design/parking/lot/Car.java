package design.parking.lot;

public class Car {
	
	public enum type {Classic, Handicapped, Compact};
	
	public type carType;

	public type getCarType() {
		return carType;
	}

	public void setCarType(type carType) {
		this.carType = carType;
	}

}
