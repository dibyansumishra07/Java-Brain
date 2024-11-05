package PROBLEM_SOLVING.DESIGN_PATTERNS.BEHAVIORAL.OBSERVER.YOUTUBE;
/*
* Main class which will run the concept
* */
public class Youtube {
    public static void main(String[] args) {
        Channel travelVlog = new Channel();

        Subscriber s1 = new Subscriber("Dibyansu");
        Subscriber s2 = new Subscriber("Dibyansu2");
        Subscriber s3 = new Subscriber("Dibyansu3");
        Subscriber s4 = new Subscriber("Dibyansu4");
        Subscriber s5 = new Subscriber("Dibyansu5");

        travelVlog.subscribe(s1);
        travelVlog.subscribe(s2);
        travelVlog.subscribe(s3);
        travelVlog.subscribe(s4);
        travelVlog.subscribe(s5);

        travelVlog.unsubscribe(s3);

        s1.subscribeChannel(travelVlog);
        s2.subscribeChannel(travelVlog);
        s3.subscribeChannel(travelVlog);
        s4.subscribeChannel(travelVlog);
        s5.subscribeChannel(travelVlog);

        travelVlog.uploadVideo("New Journey to India");

    }
}
