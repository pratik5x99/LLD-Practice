package Lesson2_OpenClosedPrinciple.TakeHomeTask.MyCode;

public class Electronics implements Product {
    private double price;


    public Electronics(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscountAmount() {

        return price * 0.10;
    }
}