package DesignPatterns.BehaviouralDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel {
    List<Subscriber> subscriberList = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }
    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }
    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.updateSubscriber();
        }
    }
    @Override
    public void uploadVideo(String title){
        this.title = title;
        notifySubscribers();
    }
}
