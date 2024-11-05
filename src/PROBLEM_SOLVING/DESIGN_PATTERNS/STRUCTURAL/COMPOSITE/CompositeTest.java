package PROBLEM_SOLVING.DESIGN_PATTERNS.STRUCTURAL.COMPOSITE;

public class CompositeTest {
    public static void main(String[] args) {
        // ! Creating last level or leaf nodes
        Leaf leafHDD = new Leaf("HardDrive",4000);
        Leaf leafMouse = new Leaf("Mouse",200);
        Leaf leafMonitor = new Leaf("Monitor",15000);
        Leaf leafRAM = new Leaf("RAM",8000);
        Leaf leafCPU = new Leaf("CPU",23000);

        // ! Creating Groups or Composite nodes which will hold the leafs.
        Composite componentPeri = new Composite("Peri");
        Composite componentCabinet = new Composite("Cabinet");
        Composite componentMB = new Composite("MB");
        Composite componentComputer = new Composite("Computer");

        // ! Adding Leafs to it's relevant composite.
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
