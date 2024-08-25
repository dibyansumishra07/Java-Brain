package BackToBasics.oopsConcepts.innerClasses;

public class AnonymousInnerClass {
    public void display() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside anonymous inner class");
            }
        };
        new Thread(runnable).start();
    }
}
