package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public class TruckPremiumStrategy implements PremiumStrategy {

    @Override
    public boolean appliesTo(Vehicle vehicle) {
        return vehicle instanceof Truck;
    }

    @Override
    public double calculate(Vehicle vehicle, double basePremium) {
        Truck truck = (Truck) vehicle;
        double finalPremium = basePremium;

        finalPremium += (truck.getCargoCapacityTons() * 100.0);

        if (truck.transportsHazardousMaterials()) {
            finalPremium *= 2.0;
        }
        return finalPremium;
    }

    @Override
    public String getPolicyName() {
        return "Commercial Truck Policy";
    }
}