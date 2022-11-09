package exception.hwThree.human;

import java.util.Arrays;

public class Group {
    private String groupName;
    private final Student[] students;

    public Group(String groupName) {
        super();
        this.groupName = groupName;
        students = new Student[10];
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        throw new IllegalAccessError("Students list are full ");
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getLastName() == lastName) {
                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException("Student not found");
    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public String sortStudentByLastName(){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                Arrays.sort(students, new StudentNameComparator());

            }
        }

        return toString();
    }

    public String toStringDefault() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public String toString() {
        String result = "Group name: " + groupName + System.lineSeparator();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                result += students[i] + System.lineSeparator();
            }
        }
        return result;
    }
}
