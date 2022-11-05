package hwTwo.animal;

public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return "wof-wof ";
    }

    public void eat(){
        System.out.println("I am eating " + getRation() + " now");
    }

    public void sleep(){
        System.out.println("Dog sleep Uiii");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
