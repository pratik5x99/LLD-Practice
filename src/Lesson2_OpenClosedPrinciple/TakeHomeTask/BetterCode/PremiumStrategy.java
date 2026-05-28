package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public interface PremiumStrategy {
    boolean appliesTo(Vehicle vehicle);
    double calculate(Vehicle vehicle, double basePremium);
    String getPolicyName();
}