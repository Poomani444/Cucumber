package fullyabstract;

public class Class_c implements Class_a, Class_b {

	@Override
	public void lands() {
		int a=3;
		int b = 5;
		System.out.println(a+b);
		
	}

	@Override
	public void buiuldings() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void twoWheeler() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fourwheeler() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Class_c c = new Class_c();
		c.lands();
	}

	
}
