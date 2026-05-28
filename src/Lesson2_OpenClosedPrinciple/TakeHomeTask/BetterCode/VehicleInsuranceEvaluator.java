package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

import java.util.List;

public class VehicleInsuranceEvaluator {

    private final List<PremiumStrategy> strategies;

    // Dependency Injection: The evaluator asks for a list of strategies when created,
    // rather than instantiating them itself using the 'new' keyword.
    public VehicleInsuranceEvaluator(List<PremiumStrategy> strategies) {
        this.strategies = strategies;
    }

    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        double basePremium = 500.0;

        for (PremiumStrategy strategy : strategies) {
            if (strategy.appliesTo(vehicle)) {
                return new InsuranceQuote(
                        strategy.calculate(vehicle, basePremium),
                        strategy.getPolicyName()
                );
            }
        }

        throw new IllegalArgumentException("Unsupported vehicle type.");
    }
}