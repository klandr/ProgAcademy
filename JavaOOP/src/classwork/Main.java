package classwork;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = cat2;

        cat1.name = "Sheldon";
        cat1.color = "white";
        cat1.weight = 2;

        System.out.println(cat1.getClass());
        System.out.println(cat1);
    }
}
