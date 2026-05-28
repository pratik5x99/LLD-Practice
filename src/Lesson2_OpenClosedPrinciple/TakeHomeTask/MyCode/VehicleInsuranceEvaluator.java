package Lesson2_OpenClosedPrinciple.TakeHomeTask.MyCode;

class InsuranceQuote {

    public InsuranceQuote(double finalPremium, String carPolicy) {

    }
}

interface Vehicle {
    double getFinalPremium(double basePremium);
    String getInsurancePolicy();

}

class Car implements Vehicle {

    public boolean hasAdvancedAirbags() {
        ;
    }

    public boolean isSportsModel() {
        ;
    }
    public double getFinalPremium(double basePremium){
    return new CarInsurancePremium().getPremium(this,basePremium);
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
    public double getFinalPremium(double basePremium) {

        return new TruckInsurancePremium().getPremium(this,basePremium);
    }

    @Override
    public String getInsurancePolicy() {
        return "Commercial Truck Policy...";
    }
}

public class VehicleInsuranceEvaluator {

    // The single entry point for all insurance calculations
    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        double basePremium = 500.0;
        return new InsuranceQuote(vehicle.getFinalPremium(basePremium),vehicle.getInsurancePolicy());



    }
}