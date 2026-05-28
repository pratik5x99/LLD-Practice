package Lesson2_OpenClosedPrinciple.TakeHomeTask.MyCode;

public class Clothing implements Product {
    private double price;

    public Clothing(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscountAmount() {
        return price * 0.20;
    }
}