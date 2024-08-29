package DesignPatterns.StructureDesignPattern.compositeDesignPattern;

public class CompositeTest {
    public static void main(String[] args) {
        Leaf leafHDD = new Leaf("Harddrive",4000);
        Leaf leafMouse = new Leaf("Mouse",200);
        Leaf leafMonitor = new Leaf("Monitor",15000);
        Leaf leafRAM = new Leaf("RAM",8000);
        Leaf leafCPU = new Leaf("CPU",23000);

        Composite componentPeri = new Composite("Peri");
        Composite componentCabinet = new Composite("Cabinet");
        Composite componentMB = new Composite("MB");
        Composite componentComputer = new Composite("Computer");

        componentMB.addComponent(leafCPU);
        componentMB.addComponent(leafRAM);

        componentPeri.addComponent(leafMouse);
        componentPeri.addComponent(leafMonitor);

        componentCabinet.addComponent(leafHDD);
        componentCabinet.addComponent(componentMB);

        componentComputer.addComponent(componentPeri);
        componentComputer.addComponent(componentCabinet);

        componentComputer.showPrice();
    }
}
