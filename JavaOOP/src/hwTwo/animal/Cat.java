package hwTwo.animal;

public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return "miu-miu ";
    }

    public void eat(){
        System.out.println("I am eating " + getRation() + " now");
    }

    public void sleep(){
        System.out.println("Cat sleep frrr ");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
