package Lesson2_OpenClosedPrinciple.TakeHomeTask.MyCode;

public class CarInsurancePremium {
    double getPremium(Car car,double basePremium){
        double finalPremium = basePremium;
        if (car.hasAdvancedAirbags()) {
            finalPremium -= 50.0; // Discount for safety
        }
        if (car.isSportsModel()) {
            finalPremium += 200.0; // Penalty for fast cars
        }
        return finalPremium;
    }
}
