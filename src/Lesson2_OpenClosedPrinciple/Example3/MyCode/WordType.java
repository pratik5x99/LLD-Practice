package Lesson2_OpenClosedPrinciple.Example3.MyCode;

public class WordType implements DocType {
    @Override
    public String generate() {
        System.out.println("Generating Word...");
    }
}
