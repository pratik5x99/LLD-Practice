package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public class InsuranceQuote {
    private final double finalPremium;
    private final String policyName;

    public InsuranceQuote(double finalPremium, String policyName) {
        this.finalPremium = finalPremium;
        this.policyName = policyName;
    }

    public double getFinalPremium() {
        return finalPremium;
    }

    public String getPolicyName() {
        return policyName;
    }
}