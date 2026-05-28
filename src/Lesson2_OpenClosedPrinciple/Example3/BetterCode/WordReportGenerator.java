package Lesson2_OpenClosedPrinciple.Example3.BetterCode;

public class WordReportGenerator implements ReportGenerator{

    @Override
    public String generate() {
        return "Generating Word Report";
    }
}
