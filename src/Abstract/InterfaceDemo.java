package Abstract;


public class InterfaceDemo {

	public static void main(String[] args) {

		 GasVehicle gasObj = new GasVehicle();
	        gasObj.milesCounter= 100;
	        gasObj.fuelConsumed = 20;
	        System.out.println("eff of gas vehicle is "+gasObj.getMileage());
	        
	        ElectricVehicle elcObj = new ElectricVehicle();
	        elcObj.milesCounter =100;
	        elcObj.powerConsumed= 15;
	        elcObj.changeBattery();
	        System.out.println("eff of electric vehicle is "+elcObj.getMileage());
	        
	        HybridVehicle hObj = new HybridVehicle();
	        hObj.milesCounter = 100;
	        hObj.powerConsumed= 10;
	        hObj.fuelConsumed = 10;
	        hObj.changeBattery();
	        System.out.println("eff of hybrid vehicle is "+hObj.getMileage());
	        
	        batteryMachines bmObj = new a();
	        bmObj.changeBattery();
	        
	        bmObj = new b();
	        bmObj.changeBattery();
	}

}

interface fuelEfficiency {
	int testInterface = 10;
	float getMileage();
}

interface hybridEfficiency extends fuelEfficiency {
	
	float getFuelEfficiency();
	float getChargeEfficiency();
}

interface batteryMachines {
	void changeBattery();
}

class a implements batteryMachines {
	public void changeBattery() {
		System.out.println("Changing a Battery");
	}
}

class b implements batteryMachines {
	public void changeBattery() {
		System.out.println("Changing B Battery");
	}
}

class HybridVehicle implements hybridEfficiency, batteryMachines {
	float milesCounter;
	float fuelConsumed;
	float powerConsumed;
	
	public void changeBattery() {
		System.out.println("Changing Hybrid Battery");
	}
	public float getFuelEfficiency() {
		return milesCounter/fuelConsumed;
	}
	public float getChargeEfficiency() {
		return milesCounter/powerConsumed;
	}
	public float getMileage() {
		return ((0.5f * getFuelEfficiency())+(0.5f*getChargeEfficiency()));
	}
}

class ElectricVehicle implements fuelEfficiency,batteryMachines{
	float milesCounter;
	float powerConsumed;
	
	public void changeBattery() {
		System.out.println("Changing elctrical vehicle battery");
	}
	public float getMileage() {
		return milesCounter/powerConsumed;
	}
	
}
class GasVehicle implements fuelEfficiency {
	float milesCounter;
	float fuelConsumed;
	
	public float getMileage() {
		return milesCounter/fuelConsumed;
	}
}