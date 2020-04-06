package automobile;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.increaseSpeed();
		c1.speed = 10;
		c1.setPrivateSpeed(10);
		int pSpeed = c1.getPrivateSpeed();
		//c1.privateSpeed = 500;
		
		System.out.println("Private Speed is:" + pSpeed);
		c1.publicSpeed = 100;
		c1.protectedSpeed = 100;
		c1.decreaseSpeed();
	}
}