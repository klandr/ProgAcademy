package classwork;

public class Cat {
    String name;
    int weight;
    String color;

    public String meow() {
        return "meow meow ";
    }

    public void jump() {
        System.out.println("hop");
    }

   // @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

//    public String toString() {
//        return "Cat [name = " + name + ", weight = " + weight + ", color = " + color + "]";
//    }
}
