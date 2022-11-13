package exception.hwThreeAndFour.human;

import java.util.Comparator;

public class StudentNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        if (student1 != null) {
            String lName1 = student1.getLastName();
            String lName2 = student2.getLastName();


            if (lName1.compareTo(lName2) > 0) {
                return 1;
            }
            if (lName1.compareTo(lName2) < 0) {
                return -1;
            }
        }
            return 0;
    }
}
