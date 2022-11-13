

public class AndersonTestInsideThread extends Thread {
    AndersonTestInsideThread() {
    }

    AndersonTestInsideThread(Runnable r) {
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
        new AndersonTestInsideThread().start();
        new AndersonTestInsideThread(new RunableDemo()).start();
    }
}

