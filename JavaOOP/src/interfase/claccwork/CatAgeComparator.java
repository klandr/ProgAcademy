package interfase.claccwork;

import java.util.Comparator;

public class CatAgeComparator implements Comparator {


    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;

        int lAge1 = cat1.getAge();
        int lAge2 = cat2.getAge();

        if (lAge1 > lAge2) {
            return -1;
        }
        if (lAge1 < lAge2) {
            return 1;
        }
        return 0;

    }


}
