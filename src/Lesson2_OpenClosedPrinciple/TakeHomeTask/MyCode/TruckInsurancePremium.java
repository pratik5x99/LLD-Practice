package Lesson2_OpenClosedPrinciple.TakeHomeTask.MyCode;

public class TruckInsurancePremium{
    double getPremium(Truck truck,double basePremium){
        double finalPremium = basePremium;
        finalPremium += (truck.getCargoCapacityTons() * 100.0); // Heavy trucks cost more

        if (truck.transportsHazardousMaterials()) {
            finalPremium *= 2.0; // Double the price for dangerous cargo
        }
        return finalPremium;
    }
}
