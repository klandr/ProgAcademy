public class AndersonTestHellaJava implements Runnable {
    String x, y;

    public void run(){
        for (int i = 0; i<10; i++)
            synchronized (this) {
            x="hello";
            y="java";
                System.out.println(x + " " + y + " ");
        }
    }

    public static void main(String[] args) {
        AndersonTestHellaJava run = new AndersonTestHellaJava();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();
    }

}
