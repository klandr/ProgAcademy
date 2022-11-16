package ioStreams.classwork;

public class ClassworkMain extends Thread{
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName()+ " Start");
//        try {
//            mainThread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        FactorialTask task1 = new FactorialTask(10);
        FactorialTask task2 = new FactorialTask(10);
        FactorialTask task3 = new FactorialTask(10);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

//        try {
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread1.stop();
//        thread2.stop();
//        thread3.stop();

        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();


        System.out.println("Sum = " + task1.getFactorialSum());
        System.out.println("Sum = " + task2.getFactorialSum());
        System.out.println("Sum = " + task3.getFactorialSum());

        System.out.println(mainThread.getName()+ " Stop");
        //System.out.println(mainThread.getId());
    }
}
