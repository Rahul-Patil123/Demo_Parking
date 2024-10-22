package parking;

import user.*;
import vehicle.*;
import pass.*;

public class Main {
	public static void main(String args[]) {
		User kritika = new Student("Kritika Kumari", "9765504123");
		Vehicle myVehicle = new Car("BR 01 PB 4885", kritika);
		Pass mp = new Monthly(myVehicle);
		System.out.println(mp);
	}
}