package Lesson2_OpenClosedPrinciple.Example3.BetterCode;

public class PdfReportGenerator implements ReportGenerator{

    @Override
    public String generate() {
        return "Generating PDF report";
    }
}
