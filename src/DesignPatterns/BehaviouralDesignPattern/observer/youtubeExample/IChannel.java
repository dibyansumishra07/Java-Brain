package DesignPatterns.BehaviouralDesignPattern.observer.youtubeExample;

public interface IChannel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();

    void uploadVideo(String title);
}
