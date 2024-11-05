package PROBLEM_SOLVING.DESIGN_PATTERNS.STRUCTURAL.ADAPTER.weightMachine;

// ! Existing Adaptee Interface
public interface WeightMachine {
    public double getWeightInPound();
}

// ! Existing Adaptee Class
class WeightMachineForKids implements WeightMachine {

    @Override
    public double getWeightInPound() {
        return 28;
    }
}

// ! Adapter interface which will help client to communicate with existing Adaptee
interface WeightMachineAdapter {
    public double getWeightInKG();
}
// ! Implement what we want to adapt
class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;
    WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKG() {
        return weightMachine.getWeightInPound() * 10;
    }
}
//! Client Class
class AdapterDesignPattern{
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForKids());
        System.out.println(weightMachineAdapter.getWeightInKG());
    }
}