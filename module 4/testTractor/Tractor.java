package testTractor;

public class Tractor {

	private int vehicleId;
	private int rentalRate;
	private int rentalDays;

	public Tractor() {
		super();
	}

	public Tractor(int vehicleId, int rentalRate, int rentalDays) {
		super();
		this.vehicleId = vehicleId;
		this.rentalRate = rentalRate;
		this.rentalDays = rentalDays;
	}

	public void setVehicleId(int vehicleId) {
		if (vehicleId < 0) {
			System.out.println("Please provide valid vehicleId, greater than or equal to zero");
		}
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public int getRentalDays() {
		return rentalDays;
	}

	public void setRentalDays(int rentalDays) {
		if (rentalDays < 0) {
			System.out.println("Please provide valid days, greater than or equal to zero");
			return;
		}
		this.rentalDays = rentalDays;
	}

	public int getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(int rentalRate) {
		if (rentalRate < 0) {
			System.out.println("Please provide valid rental rate, greater than or equal to zero");
			return;
		}
		this.rentalRate = rentalRate;
	}

	public int RentalProfit() {
		return rentalRate * rentalDays;
	}

	@Override
	public String toString() {
		return "Tractor [vehicleId=" + vehicleId + ", rentalRate=" + rentalRate + ", rentalDays=" + rentalDays + "]";
	}

}
