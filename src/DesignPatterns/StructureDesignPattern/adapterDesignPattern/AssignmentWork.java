package DesignPatterns.StructureDesignPattern.adapterDesignPattern;

public class AssignmentWork {
    private Pen p;
    public void writeAssignment(String assignment){
        p.write(assignment);
    }
    public Pen getP() {
        return p;
    }
    public void setP(Pen p) {
        this.p = p;
    }
}