package ADVANCE_JAVA.LatestJavaFeatures;

import PROBLEM_SOLVING.DESIGN_PATTERNS.BehaviouralDesignPattern.observer.youtubeExample.Subscriber;

public class AdvanceInstanceOfExample {
    public static void main(String[] args) {
        Object string = "Dibaynsu";
        Object subscriber = new Subscriber("");
        if(subscriber instanceof Subscriber s) {
            System.out.println("PatternMatching passed"+ ((Subscriber) subscriber).getName());// Older approach
            System.out.println("PatternMatching passed"+ s.getName());// Newer approach
        }
    }
}
