package ioStreams.hwSeven;

import ioStreams.classwork.FactorialTask;

public class HomeworkMain extends Thread{
    public static void main(String[] args) {
        Thread myThread = Thread.currentThread();;

        FactorialTask[] arrayFactorial = new FactorialTask[100];
        for (int i = 0; i < arrayFactorial.length; i++) {
            arrayFactorial[i] = new FactorialTask(i);
            myThread = new Thread(arrayFactorial[i]);
            myThread.start();
        }

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < arrayFactorial.length; i++) {
            System.out.println("Sum = " + arrayFactorial[i].getFactorialSum());
        }
    }
}
