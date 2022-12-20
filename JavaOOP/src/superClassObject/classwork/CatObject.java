package superClassObject.classwork;

import java.util.Objects;

public class CatObject implements Cloneable {
    private String name;
    private int age;

    public CatObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CatObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CatObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatObject catObject = (CatObject) o;
        return age == catObject.age && Objects.equals(name, catObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public CatObject clone() throws CloneNotSupportedException {
        return (CatObject) super.clone();
    }
}
