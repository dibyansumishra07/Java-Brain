package PROBLEM_SOLVING.DESIGN_PATTERNS.BEHAVIORAL.OBSERVER.YOUTUBE;
/*
* Observer
* */
public class Subscriber implements ISubscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    /*
    * Push notification logic
    * */
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
