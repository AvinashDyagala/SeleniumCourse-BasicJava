package automobile;

public class BMW extends Cars{
       public char ModelName;
       public BMW() {
    	   super();
       }
       
       public BMW(int speed) {
    	   super(speed);
       }
       
       public BMW(int speed, int gear) {
    	   super(speed,gear);
       }
       
       
   	public void headupDisplayNavigation() {
		System.out.println("This is the headsup navigation");
	}

}
