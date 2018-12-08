package practice4thClass;

public class toyota  extends MotorCar {//toyota  collect information from MotorCar by using Keyword Extends, and MotorCaer  collect information from 
     // car.jave (   ***both car.java & MotorCar.java are abstract class***   )   using Keyword implements
	public void start() {
	System.out.println("Start the car to Drive INTERFACE also have access form toyota class");		
	}
	public void stop() {
	System.out.println("Push brake to stop INTERFACE ");	
	}
    public void putPark() {
    	System.out.println("Please put your car on brake");
    }
	public void newHybridBattery() {
		System.out.println("Fully new Hybrid battery installed hyBridCar");
		
	}
	//From MotorCar Abstract class
	public void elecTricCar() {
		// TODO Auto-generated method stub
		System.out.println("This car cost no gasolin");
		
	}

}
