package superClassObject.classwork;

import java.lang.reflect.Field;

public class CatObjectMain {
    public CatObject catObject;

    public static void main(String[] args) {
        CatObject cat1 = new CatObject("Kishka", 4);
        CatObject cat2 = new CatObject("Kishka", 4);

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println("--------------------------------------------------------");
        try {
            CatObject cat3 = cat1.clone();
            System.out.println(cat1 == cat3);
            System.out.println(cat1.getClass());
            System.out.println(cat3.getClass());
            System.out.println(cat3.equals(cat1));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------------");

        Class catClass = CatObject.class;
        Field[] fields = catClass.getDeclaredFields();
        for (int i=0;i< fields.length;i++){
            System.out.println(fields[i]);
        }
        try {
            Field catAge = catClass.getDeclaredField("age");
            catAge.setAccessible(true);
            catAge.setInt(cat1,12);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cat1);
    }
}
