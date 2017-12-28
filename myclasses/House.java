package myclasses;

public class House extends Home {
	
	
	public House(int a) {
		// TODO Auto-generated constructor stub
		setSquareFootage(a);
	}

	public House() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		
	}
	
	void foo() {
       // int x = getX(); // we can access the method since it is protected.
        setSquareFootage(42);  // this works too.
    }

}
