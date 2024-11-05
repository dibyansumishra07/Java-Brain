package PROBLEM_SOLVING.DESIGN_PATTERNS.BEHAVIORAL.OBSERVER.YOUTUBE;

public interface IChannel {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();

    void uploadVideo(String title);
}
