package myPackage;

public interface InterfaceDemo {

	 public  void Engine();
	 
	 public void seats();
	 
	 public static void NoOfWheels() {
		 
		 System.out.println("All Cars has 4 wheels");
	 }
	 
	 default void Music() {
		 System.out.println("Music may differ and based on car price/can be customised");
	 }
}
