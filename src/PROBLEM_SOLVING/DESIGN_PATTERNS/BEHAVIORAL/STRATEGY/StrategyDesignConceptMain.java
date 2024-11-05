package PROBLEM_SOLVING.DESIGN_PATTERNS.BEHAVIORAL.STRATEGY;

public class StrategyDesignConceptMain {
    public static void main(String[] args) {
        VehicleWithStrategyDesign vehicleWithStrategyDesign = new OffRoadVehicleWithStrategy();
        VehicleWithoutStrategyDesign vehicleWithoutStrategyDesign = new OffRoadVehicle();

        vehicleWithoutStrategyDesign.drive();
        vehicleWithStrategyDesign.drive();

    }
}
