package PROBLEM_SOLVING.DESIGN_PATTERNS.CreationalDesignPatterns.factoryDesignPattern;

import PROBLEM_SOLVING.DESIGN_PATTERNS.CreationalDesignPatterns.factoryDesignPattern.phone.OS;
import PROBLEM_SOLVING.DESIGN_PATTERNS.CreationalDesignPatterns.factoryDesignPattern.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.specification();
    }
}
