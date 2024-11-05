package PROBLEM_SOLVING.DESIGN_PATTERNS.BEHAVIORAL.STRATEGY;
/*
* Defining strategy using interface and reusable children classes
* */
interface DriveStrategy {
    public void drive();
}
class PowerDriveStrategy implements DriveStrategy{
    public void drive(){
        System.out.println("Power Drive!!");
    }
}
class AverageDriveStrategy implements DriveStrategy{
    public void drive(){
        System.out.println("Average Drive!");
    }
}
class NormalDriveStrategy implements DriveStrategy{
    public void drive(){
        System.out.println("Normal Drive");
    }
}

/*
* Defining Parent Class with common functionality.
* This class is using dependency injection of Strategy interface to implement dynamic drive implementation
* */
public class VehicleWithStrategyDesign {

    // * Doing constructor injection of Drive Strategy
    DriveStrategy driveStrategy;

    public VehicleWithStrategyDesign(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    // * Dynamic drive function which can be defined by child classes
    public void drive() {
        driveStrategy.drive();
    }
}
/*
* Below child classes will extend the parent vehicle and call parent constructor with super and required driving strategy
* */
class OffRoadVehicleWithStrategy extends VehicleWithStrategyDesign {
    // * Providing driving implementation to Vehicle class, using power drive strategy
    public OffRoadVehicleWithStrategy() {
        super(new PowerDriveStrategy());
    }
}

class PickUpTrucksWithStrategy extends VehicleWithStrategyDesign {
    // * Providing driving implementation to Vehicle class, using power drive strategy
    public PickUpTrucksWithStrategy() {
        super(new PowerDriveStrategy());
    }
}

class SedanWithStrategy extends VehicleWithStrategyDesign {
    // * Providing driving implementation to Vehicle class, using power drive strategy
    public SedanWithStrategy() {
        super(new AverageDriveStrategy());
    }
}

class HatchBackWithStrategy extends VehicleWithStrategyDesign {
    // * Providing driving implementation to Vehicle class, using power drive strategy
    public HatchBackWithStrategy() {
        super(new NormalDriveStrategy());
    }
}


