package andersentest;

public class AndersenTestInsideThread extends Thread {
    AndersenTestInsideThread() {
    }

    AndersenTestInsideThread(Runnable r) {
        super();
    }

    public void run() {
        System.out.println("Inside Thread");
    }
}

    class RunableDemo implements Runnable{
    public void run(){
        System.out.println("Inside Runnable");
        }
}

class ThreadDemo{
    public static void main(String[] args) {
        new AndersenTestInsideThread().start();
        new AndersenTestInsideThread(new RunableDemo()).start();
    }
}

