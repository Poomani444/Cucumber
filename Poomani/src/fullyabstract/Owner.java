package fullyabstract;

public class Owner implements Lands, Vehicles {
          //Multiple Inheritance done by implements keyword
	

	@Override
	public void twoWheeler() {
		System.out.println("Bike");
		
	}

	@Override
	public void fourWheeler() {
		System.out.println("Car");
		
	}

	@Override
	public void heaveyVehicle() {  
		System.out.println("Lorry");
		
	}

	@Override
	public void apartment() {
		System.out.println("Blue colour");
	}

	@Override
	public void building() {
		System.out.println("Brown colour");
		
	}
	public static void main(String[] args) {
		Owner o = new Owner();
		o.twoWheeler();
		o.fourWheeler();
		o.heaveyVehicle();
		o.apartment();
		o.building();
	}

}
