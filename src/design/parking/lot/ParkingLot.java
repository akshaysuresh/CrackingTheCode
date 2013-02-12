package design.parking.lot;

import java.util.HashMap;
import java.util.Map;

import design.parking.lot.Car;

public class ParkingLot {
	public static final int NO_OF_CLASSIC_SPOTS = 5;
	public static final int NO_OF_HANDICAPPED_SPOTS = 1;
	public static final int NO_OF_COMPACT_SPOTS = 2;
	public static Map<Car.type, boolean[]> parkingSpaces;
	
	public static void initializeParkingLot(){
		parkingSpaces = new HashMap<Car.type, boolean[]>();
		boolean[] classicSpaces = new boolean[NO_OF_CLASSIC_SPOTS];
		boolean[] handicappedSpaces = new boolean[NO_OF_HANDICAPPED_SPOTS];
		boolean[] compactSpaces = new boolean[NO_OF_HANDICAPPED_SPOTS];
		
		parkingSpaces.put(Car.type.Classic, classicSpaces);
		parkingSpaces.put(Car.type.Handicapped, handicappedSpaces);
		parkingSpaces.put(Car.type.Compact, compactSpaces);
	}

	public static boolean isemptySpaceAvailable(Car.type carType){
		boolean[] parkingSpots = parkingSpaces.get(carType);
		for(boolean b : parkingSpots){
			if(!b){
				return true;
			}
		}
		return false;
	}

	public static void parkCar(Car c){
		boolean[] parkingSpots = parkingSpaces.get(c.carType);
		int flag=0;
		for(int i=0; i< parkingSpots.length; i++){
			if(!parkingSpots[i]){
				parkingSpots[i] = true;
				flag = 1;
				System.out.println("Car has been parked");
				break;
			}
		}
		if(flag == 0) {
			System.out.println("No parking space is available");
		}
	}
	
	public static void main(String[] args){
		
		initializeParkingLot();
		
		Car c1 = new Car();
		c1.setCarType(Car.type.Classic);
		ParkingLot.parkCar(c1);
		
		Car c2 = new Car();
		c2.setCarType(Car.type.Handicapped);
		ParkingLot.parkCar(c2);
		
		Car c3 = new Car();
		c3.setCarType(Car.type.Classic);
		ParkingLot.parkCar(c3);
		
		Car c4 = new Car();
		c4.setCarType(Car.type.Handicapped);
		ParkingLot.parkCar(c4);
		
	}

}
