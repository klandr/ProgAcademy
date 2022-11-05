package hwOne.item;

public class Item {

    private double prise;
    private String describe;
    private double weight;

    public Item(double prise, String describe, double weight) {
        this.prise = prise;
        this.describe = describe;
        this.weight = weight;
    }

    public Item() {

    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Item{" +
                "prise=" + prise +
                ", describe='" + describe + '\'' +
                ", weight=" + weight +
                '}';
    }

}
