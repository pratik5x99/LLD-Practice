package Lesson2_OpenClosedPrinciple.TakeHomeTask.ProblematicCode;

class InsuranceQuote {

}

class Vehicle {

}

class Car extends Vehicle {

    public boolean hasAdvancedAirbags() {
    }

    public boolean isSportsModel() {
    }
}

class Truck extends Vehicle {

    public double getCargoCapacityTons() {
    }

    public boolean transportsHazardousMaterials() {
        return false;
    }
}

public class VehicleInsuranceEvaluator {

    // The single entry point for all insurance calculations
    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {

        double basePremium = 500.0; // Everyone starts with a $500 baseline

        // PATH 1: The system detects a Car
        if (vehicle instanceof Car) {

            // 1. Downcasting: We have to force Java to treat the generic Vehicle as a Car
            Car car = (Car) vehicle;

            // 2. Car-specific logic
            double finalPremium = basePremium;
            if (car.hasAdvancedAirbags()) {
                finalPremium -= 50.0; // Discount for safety
            }
            if (car.isSportsModel()) {
                finalPremium += 200.0; // Penalty for fast cars
            }

            return new InsuranceQuote(finalPremium, "Car Policy");

            // PATH 2: The system detects a Truck
        } else if (vehicle instanceof Truck) {

            // 1. Downcasting
            Truck truck = (Truck) vehicle;

            // 2. Truck-specific logic
            double finalPremium = basePremium;
            finalPremium += (truck.getCargoCapacityTons() * 100.0); // Heavy trucks cost more

            if (truck.transportsHazardousMaterials()) {
                finalPremium *= 2.0; // Double the price for dangerous cargo
            }

            return new InsuranceQuote(finalPremium, "Commercial Truck Policy");
        }

        // PATH 3: The system panics
        throw new IllegalArgumentException("Unsupported vehicle type.");
    }
}