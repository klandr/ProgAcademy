package exception.hwThreeAndFour.human;

public class HumanMain {
    public static void main(String[] args) {
        Student student1 = new Student("Maria", "M", Gender.WOMAN, 1, "MathClass");
        Student student2 = new Student("Lin", "D", Gender.MAN, 2, "GeographicClass");
        Student student3 = new Student("Nik", "S", Gender.MAN, 3, "Historical");

        Group group1 = new Group("Try");
        // System.out.println(group1.toStringDefault());
        try {
            group1.addStudent(student1);
            group1.addStudent(student2);
            group1.addStudent(student3);
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }
        System.out.println("Group after add all student " + group1);

        try {
            System.out.println("luk for by Last Name: " + group1.searchStudentByLastName("D"));
        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Removing student by ID " + group1.removeStudentByID(4));
        System.out.println();
        System.out.println("Soring by Last name: " + group1.sortStudentByLastName());

        try {
            group1.addStudent(StudentScan.myScan());
        } catch (GroupOverflowException e) {
            e.printStackTrace();
        }
        System.out.println("printing group after add by scan " + group1.toStringDefault());
        // System.out.println(CSVStringConverter.saveGroupToCSV(group1));
    }
}
