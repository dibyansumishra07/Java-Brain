package DesignPatterns.StructureDesignPattern.compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}
public class Leaf implements Component{
    int price;
    String name;
    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void showPrice() {
        System.out.println(name+" : "+price);
    }
}
class Composite implements Component{
    List<Component> components = new ArrayList<>();
    String name;
    public Composite(String name) {
        this.name = name;
    }
    public void addComponent(Component component) {
        components.add(component);
    }
    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component component : components){
            component.showPrice();
        }
    }
}
