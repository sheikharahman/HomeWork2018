package practice4thClass;

public abstract class MotorCar extends hyBridCar implements car , flyIngCar{// motor car is collecting car information 
  public void oilMotorEngine() {//this is a implemented method which is implemented. 
	  System.out.println("Run only gasolin ");
  }
  public abstract void elecTricCar(); // this is an abstract method, not abstract method implementation. 
}
