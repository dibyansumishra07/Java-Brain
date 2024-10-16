package PROBLEM_SOLVING.DESIGN_PATTERNS.StructureDesignPattern.adapterDesignPattern;

public class PenAdaptor implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String assignment) {
        pp.mark(assignment);
    }
}
