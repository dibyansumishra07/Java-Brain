package PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.FACTORY;

import PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.FACTORY.phone.OS;
import PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.FACTORY.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.specification();
    }
}
