package pass;

import java.time.LocalDateTime;

import vehicle.Vehicle;

public class Daily extends Pass {
	private LocalDateTime expiry = LocalDateTime.now();
	private int price = 0;
	Daily(Vehicle vehicle){
		super(vehicle);
	}
	public int getPrice() {
		String type = this.vehicle.getType();
		return type == "cycle" ? 5 : (type == "bike" ? 10 : 50);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDateTime getExpiry() {
		return expiry.plusDays(1);
	}
	public void setExpiry(LocalDateTime expiry) {
		this.expiry = expiry;
	}
}
