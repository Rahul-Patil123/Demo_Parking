package pass;

import java.time.LocalDateTime;
import vehicle.Vehicle;

public class Pass {
	private String id = "Pass-" + LocalDateTime.now();
	protected Vehicle vehicle = null;
	private LocalDateTime expiry = LocalDateTime.now();
	Pass(Vehicle vehicle){
		this.vehicle = vehicle;
	}
	
	public String toString() {
		String toPrint = "Pass Id : " + this.id;
		toPrint += "\nVehicle : " + this.vehicle.getName();
		toPrint += "\nOwner : " + this.vehicle.getOwner().getName();
		toPrint += "\nExpiry : " + this.getExpiry();
		
		return toPrint;
	}

	public LocalDateTime getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDateTime expiry) {
		this.expiry = expiry;
	}
}
