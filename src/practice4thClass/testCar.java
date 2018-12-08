package practice4thClass;

public class testCar {

	public static void main(String[] args) {
		System.out.println("Welcome");
		car dcar = new toyota(); //  *** Only has access to car.java***
		//toyota  dcr = new toyota();  I can write this too.
		dcar.start();
		dcar.stop();
		toyota nex = new toyota();
		nex.putPark();
		nex.start();
		//hyBridCar hcar = new toyota(); -->> Once I implement car with MotorCar in my testCar.jav  new toyota() is in problem.
		MotorCar nMotcr = new toyota(); // --> I create object for MotorCar because toyota.java has access to all class. & it has 
		//only access to MotorCar
		nMotcr.elecTricCar();
		//hcar.newHybridBattery();
		//hcar.hyBridBattery();
		hyBridCar hbcar = new toyota();
		hbcar.newHybridBattery();
		Accura acr = new Accura();
		acr.elecTricCar();
		acr.stop();
		acr.start();
		acr.newHybridBattery();
	}

}
