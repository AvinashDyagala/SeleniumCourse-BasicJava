package automobile;

public class Cars {
	private String make;
	int speed;
	int gear;
	private int privateSpeed;
	public int publicSpeed;
	protected int protectedSpeed;
	
	public Cars() {
		this(10, 2);
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing constructor without arguments");
	}

	public Cars(int speed) {
		this(10, 2);
		this.speed = speed;
		this.gear = 0;
		System.out.println("Executing constructor with one argument");
	}

	
	public Cars(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with arguments");
	}
	
	// "this" refers to the instance of the class (object)
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
	public void setPrivateSpeed(int pSpeed) {
		privateSpeed = pSpeed;
	}

	public int getPrivateSpeed() {
		return privateSpeed;
	}

	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		
	}
	
}