package DesignPatterns.BehaviouralDesignPattern;

public class Subscriber implements ISubscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateSubscriber(){
        System.out.println("Video "+name+" Uploaded.");
    }
    @Override
    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }

    public String getName() {
        return name;
    }
}
