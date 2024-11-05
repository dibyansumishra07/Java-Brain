package PROBLEM_SOLVING.DESIGN_PATTERNS.BEHAVIORAL.STRATEGY;

public class VehicleWithoutStrategyDesign {
    // ! Drive method for common use
    public void drive(){
        System.out.println("Normal Drive");
    }
}
class OffRoadVehicle extends VehicleWithoutStrategyDesign {
    // ! Specifying own implementation as OffRoad is not required default driving also common logic as PickUpTrucks
    @Override
    public void drive(){
        System.out.println("Power Drive");
    }
}
class PickUpTrucks extends VehicleWithoutStrategyDesign {
    // ! Specifying own implementation as PickUpTruck is not required default driving also common logic as PickUpTrucks
    public void drive(){
        System.out.println("Power Drive");
    }
}
class Sedan extends VehicleWithoutStrategyDesign {
    // ! Specifying own implementation as Sedan is not required default driving
    public void drive(){
        System.out.println("Average Drive");
    }
}
class HatchBack extends VehicleWithoutStrategyDesign {
    //* Will use default drive mode provided in vehicle class
}
