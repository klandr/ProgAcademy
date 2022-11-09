package interfase.claccwork;

import java.util.Comparator;

public class CatNameComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o1;


        String lName1 = cat1.getName();
        String lName2 = cat2.getName();


        if (lName1.compareTo(lName2) > 0) {
            return 1;
        }
        if (lName1.compareTo(lName2) < 0) {
            return -1;

        }
        return 0;

    }


}
