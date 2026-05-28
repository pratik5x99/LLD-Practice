package Lesson2_OpenClosedPrinciple.TakeHomeTask.BetterCode;

public class Car implements Vehicle {
    private final boolean advancedAirbags;
    private final boolean sportsModel;

    public Car(boolean advancedAirbags, boolean sportsModel) {
        this.advancedAirbags = advancedAirbags;
        this.sportsModel = sportsModel;
    }

    public boolean hasAdvancedAirbags() {
        return advancedAirbags;
    }

    public boolean isSportsModel() {
        return sportsModel;
    }
}