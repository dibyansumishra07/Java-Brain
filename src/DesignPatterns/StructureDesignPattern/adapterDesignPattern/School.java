package DesignPatterns.StructureDesignPattern.adapterDesignPattern;

public class School {
    public static void main(String[] args) {

        AssignmentWork aw =  new AssignmentWork();
        Pen pen = new PenAdaptor();
        aw.setP(pen);
        aw.writeAssignment("New Assignment");
    }
}
