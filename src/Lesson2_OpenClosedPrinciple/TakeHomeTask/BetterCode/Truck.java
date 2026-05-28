package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public class Truck implements Vehicle {
    private final double cargoCapacityTons;
    private final boolean hazardousMaterials;

    public Truck(double cargoCapacityTons, boolean hazardousMaterials) {
        this.cargoCapacityTons = cargoCapacityTons;
        this.hazardousMaterials = hazardousMaterials;
    }

    public double getCargoCapacityTons() {
        return cargoCapacityTons;
    }

    public boolean transportsHazardousMaterials() {
        return hazardousMaterials;
    }
}