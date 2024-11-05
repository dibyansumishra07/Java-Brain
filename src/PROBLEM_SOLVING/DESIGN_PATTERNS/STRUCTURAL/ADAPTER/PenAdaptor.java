package PROBLEM_SOLVING.DESIGN_PATTERNS.STRUCTURAL.ADAPTER;

public class PenAdaptor implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String assignment) {
        pp.mark(assignment);
    }
}
