package PROBLEM_SOLVING.DESIGN_PATTERNS.STRUCTURAL.ADAPTER;

public class School {
    public static void main(String[] args) {
        // Adapter pattern to convert an existing interface to a new interface.
        AssignmentWork aw =  new AssignmentWork();
        // Existing interface to be adapted.
        Pen pen = new PenAdaptor();
        // Adapter object adapts the existing interface to the new interface.
        aw.setP(pen);
        // The client code now uses the new interface.
        aw.writeAssignment("New Assignment");
    }
}
