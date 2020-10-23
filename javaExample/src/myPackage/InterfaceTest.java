package myPackage;

public class InterfaceTest implements InterfaceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest it = new InterfaceTest();
		it.Engine();
		it.seats();

	}

	@Override
	public void Engine() {
		// TODO Auto-generated method stub
		System.out.println("HighEnd Engine");
		
	}

	@Override
	public void seats() {
		// TODO Auto-generated method stub
		System.out.println("Luxury Seats");
		
	}

}
