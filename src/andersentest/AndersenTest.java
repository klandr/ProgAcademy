package andersentest;

public class AndersenTest implements Runnable {
    int x = 0, y = 0;
    int addX() {
        x++;
        return x;
    }
    int addY() {
        y++;
        return y;
    }
    public void run(){
        for (int i = 0; i<10; i++)
            System.out.println(Thread.currentThread().getName() + " : "+ addX()+ " : " + addY() );
        }
    public static void main(String[] args) {
        AndersenTest obj1 = new AndersenTest();
        AndersenTest obj2 = new AndersenTest();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
