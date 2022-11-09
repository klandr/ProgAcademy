package exception.hwThree.human;

public class HumanMain {
    public static void main(String[] args) {
        Student student1 = new Student("Maria","M",Gender.WOMAN,1,"MathClass");
        Student student2 = new Student("Lin","D",Gender.MAN,2,"GeographicClass");

        Group group1 = new Group("Try" );
        System.out.println(group1.toStringDefault());
        try {
            group1.addStudent(student1);
            group1.addStudent(student2);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }
        System.out.println(group1);

        try {
            System.out.println(group1.searchStudentByLastName(student1.getLastName()));
            System.out.println(group1.searchStudentByLastName("D"));
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(group1.removeStudentByID(3));
        //System.out.println(group1.sortStudentByLastName());
    }
}
