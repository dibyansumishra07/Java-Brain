package DesignPatterns.CreationalDesignPatterns.factoryDesignPattern;

import DesignPatterns.CreationalDesignPatterns.factoryDesignPattern.phone.OS;
import DesignPatterns.CreationalDesignPatterns.factoryDesignPattern.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.specification();
    }
}
