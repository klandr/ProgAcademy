package hwTwo.animal;

public class AnimalMain {
    public static void main(String[] args) {
       Cat cat1 = new Cat("cat meal", "white", 5, "Sheldon");
       Dog dog1 = new Dog("dog meal", "black",20,"Kolli");
       Veterinarian veterinarian = new Veterinarian("Nika");

       System.out.print(cat1);
        System.out.println(" " + cat1.getVoice());
        cat1.eat();
        cat1.sleep();

       System.out.print(dog1);
        System.out.println(" " + dog1.getVoice());
        dog1.eat();
        dog1.sleep();
       System.out.println(veterinarian);
        veterinarian.treatment(cat1);
        veterinarian.treatment(dog1);
    }
}
