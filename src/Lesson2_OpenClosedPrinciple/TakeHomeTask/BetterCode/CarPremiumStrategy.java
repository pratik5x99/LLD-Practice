package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public class CarPremiumStrategy implements PremiumStrategy {

    @Override
    public boolean appliesTo(Vehicle vehicle) {
        return vehicle instanceof Car;
    }

    @Override
    public double calculate(Vehicle vehicle, double basePremium) {
        Car car = (Car) vehicle;
        double finalPremium = basePremium;

        if (car.hasAdvancedAirbags()) {
            finalPremium -= 50.0;
        }
        if (car.isSportsModel()) {
            finalPremium += 200.0;
        }
        return finalPremium;
    }

    @Override
    public String getPolicyName() {
        return "Car Policy";
    }
}