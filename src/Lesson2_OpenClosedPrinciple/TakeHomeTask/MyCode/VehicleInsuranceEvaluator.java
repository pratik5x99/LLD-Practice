package Lesson2_OpenClosedPrinciple.TakeHomeTask.MyCode;

class InsuranceQuote {

    public InsuranceQuote(double finalPremium, String carPolicy) {

    }
}

interface Vehicle {
    double getFinalPremium();
    String getInsurancePolicy();

}

class Car implements Vehicle {

    public boolean hasAdvancedAirbags() {
    }

    public boolean isSportsModel() {
    }
    public double getFinalPremium(){
        double finalPremium = 500.0;
        if (this.hasAdvancedAirbags()) {
            finalPremium -= 50.0; // Discount for safety
        }
        if (this.isSportsModel()) {
            finalPremium += 200.0; // Penalty for fast cars
        }
        return finalPremium;
    }

    @Override
    public String getInsurancePolicy() {
        return "Car Policy...";
    }


}

class Truck implements Vehicle {

    public double getCargoCapacityTons() {
    }

    public boolean transportsHazardousMaterials() {
    }

    @Override
    public double getFinalPremium() {
        double finalPremium = 500.0;
        finalPremium += (this.getCargoCapacityTons() * 100.0); // Heavy trucks cost more

        if (this.transportsHazardousMaterials()) {
            finalPremium *= 2.0; // Double the price for dangerous cargo
        }
        return finalPremium;
    }

    @Override
    public String getInsurancePolicy() {
        return "Commercial Truck Policy...";
    }
}

public class VehicleInsuranceEvaluator {

    // The single entry point for all insurance calculations
    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {

        return new InsuranceQuote(vehicle.getFinalPremium(),vehicle.getInsurancePolicy());



    }
}