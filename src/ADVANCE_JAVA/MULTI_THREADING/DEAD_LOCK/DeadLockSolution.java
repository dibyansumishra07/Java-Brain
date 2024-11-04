package ADVANCE_JAVA.MULTI_THREADING.DEAD_LOCK;
class PaperS{
    public synchronized void writeWithPenAndPaper(PenS penS){
        System.out.println(Thread.currentThread().getName()+" is using Pen. "+ this + " And trying to acquire pen.");
        penS.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName()+" is finished using Paper. "+ this);
    }
}
class PenS{
    public synchronized void writeWithPenAndPaper(PaperS paperS){
        System.out.println(Thread.currentThread().getName()+" is using Paper. "+ this + " And trying to acquire pen.");
        paperS.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName()+" is finished using Pen. "+ this);
    }
}

class Task1S implements Runnable{
    private PenS penS;
    private PaperS paperS;

    public Task1S(PenS penS, PaperS paperS) {
        this.penS = penS;
        this.paperS = paperS;
    }

    @Override
    public void run() {
        // ! Before we directly apply lock on pen and then checking paper. We are first trying to lock on paper and it we got then only locking pen
        synchronized (paperS) {
            penS.writeWithPenAndPaper(paperS);
        }
    }
}

class Task2S implements Runnable{
    private PenS penS;
    private PaperS paperS;

    public Task2S(PenS penS, PaperS paperS) {
        this.penS = penS;
        this.paperS = paperS;
    }

    @Override
    public void run() {
        // ! Before we directly apply lock on paper and then checking pen. We are first trying to lock on pen and if we got then only locking paper
        synchronized (penS) {
            paperS.writeWithPenAndPaper(penS);
        }
    }
}

public class DeadLockSolution {
    public static void main(String[] args) {
        PenS penS = new PenS();
        PaperS paperS = new PaperS();

        Thread t1 = new Thread(new Task1S(penS,paperS));
        Thread t2 = new Thread(new Task2S(penS,paperS));

        t1.start();
        t2.start();
    }
}
