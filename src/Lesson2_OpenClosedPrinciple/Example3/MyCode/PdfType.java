package Lesson2_OpenClosedPrinciple.Example3.MyCode;

public class PdfType implements DocType {

    @Override
    public String generate() {
        return "Genrating PDF...";
    }
}
