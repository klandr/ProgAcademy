package ioStreams.hwSeven;

import ioStreams.classwork.FactorialTask;

public class HomeworkMain {
    public static void main(String[] args) {
        Thread thread = null;

        FactorialTask[] arrayFactorial = new FactorialTask[100];
        for (int i = 0; i < arrayFactorial.length; i++) {
            arrayFactorial[i] = new FactorialTask(10);
            thread = new Thread(arrayFactorial[i]);
            thread.start();
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < arrayFactorial.length; i++) {
            System.out.println("Sum = " + arrayFactorial[i].getFactorialSum());
        }
    }
}
