package hwOne.item;

public class MainItem {
    public static void main(String[] args) {
        Item item1 = new Item(3.5, "cap", 0.75);
        Item item2 = new Item();

        System.out.println(item1);

        item2.setPrise(5.70);
        item2.setDescribe("kettle");
        item2.setWeight(2.1);

        System.out.println(item2);
    }
}
