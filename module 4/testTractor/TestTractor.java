 package testTractor;

public class TestTractor {
	//main method to start the program
	public static void main(String[] args) {
		//create tractor object
		Tractor tractor1 = new Tractor();
		//set value in the object
		tractor1.setVehicleId(1);
		tractor1.setRentalRate(4);
		tractor1.setRentalDays(7);
		//display object value with the help of toString method
		System.out.println(tractor1);
		
		Tractor tractor2 = new Tractor(2, 5, 3);
		System.out.println(tractor2);
		Tractor tractor3 = new Tractor();
		tractor3.setRentalRate(-6);
		tractor3.setRentalDays(-10);
		System.out.println(tractor3.RentalProfit());
		tractor3=null;
	}

}
