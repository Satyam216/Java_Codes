abstract class Vehicle {
    public abstract double fuelEfficiency();
}

// Subclass for Electric Cars
class ElectricCar extends Vehicle {
    private double kWhPerMile;

    // Constructor
    public ElectricCar(double kWhPerMile) {
        this.kWhPerMile = kWhPerMile;
    }

    // Implementation of fuel efficiency
    @Override
    public double fuelEfficiency() {
        return kWhPerMile; 
    }
}

// Subclass for Petrol Cars
class PetrolCar extends Vehicle {
    private double kmPerLiter;

    public PetrolCar(double kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    // Implementation of fuel efficiency
    @Override
    public double fuelEfficiency() {
        return kmPerLiter; 
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle ev = new ElectricCar(0.3); 
        Vehicle petrol = new PetrolCar(15.0); 

        System.out.println("Electric Car Efficiency: " + ev.fuelEfficiency() + " kWh/mile");
        System.out.println("Petrol Car Efficiency: " + petrol.fuelEfficiency() + " km/liter");
    }
}
