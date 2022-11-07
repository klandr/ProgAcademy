package exception.hwThree.human;

import java.util.Arrays;

public class Group {
    String groupName;
    Student[] students = new Student[10];

    public Group(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
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

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) throws GroupOverflowException{

    }
    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{

        return null;
    }
    public boolean removeStudentByID(int id){

        return false;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
