package PROBLEM_SOLVING.DESIGN_PATTERNS.BehaviouralDesignPattern.observer.youtubeExample;

public interface IChannel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();

    void uploadVideo(String title);
}
