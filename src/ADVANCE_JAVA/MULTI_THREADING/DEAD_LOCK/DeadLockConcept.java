package ADVANCE_JAVA.MULTI_THREADING.DEAD_LOCK;
class Paper{
    public synchronized void writeWithPenAndPaper(Pen pen){
        System.out.println(Thread.currentThread().getName()+" is using Pen. "+ this + " And trying to acquire pen.");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName()+" is finished using Paper. "+ this);
    }
}
class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" is using Paper. "+ this + " And trying to acquire pen.");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName()+" is finished using Pen. "+ this);
    }
}

class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);// ! Thread 1 locks pen and trying to lock paper.
    }
}

class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        paper.writeWithPenAndPaper(pen);// ! Thread 1 locks paper and trying to lock pen.
    }
}

public class DeadLockConcept {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen,paper));
        Thread t2 = new Thread(new Task2(pen,paper));

        t1.start();
        t2.start();
    }
}
