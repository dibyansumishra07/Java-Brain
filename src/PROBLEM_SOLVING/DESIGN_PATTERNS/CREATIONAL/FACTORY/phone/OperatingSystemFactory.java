package PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.FACTORY.phone;

public class OperatingSystemFactory {
    public OS getInstance(String typeOfOs) {
        if("Open".equals(typeOfOs)){
            return new Android();
        } else if ("Close".equals(typeOfOs)) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
