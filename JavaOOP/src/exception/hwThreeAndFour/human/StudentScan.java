package exception.hwThreeAndFour.human;

import java.util.Scanner;

public class StudentScan {

    public static Student myScan(){
        String studName;
        Scanner sc = new Scanner(System.in);
        Student studentScan = new Student();
        System.out.println("Enter Student First Name ");
        studName = sc.nextLine ();
        studentScan.setName(studName);
        System.out.println("Enter Student Last Name ");
        studName = sc.nextLine ();
        studentScan.setLastName(studName);
        System.out.println("Enter Student Gender (MAN or WOMAN) ");
        studName = sc.nextLine ();
        studentScan.setGender(Gender.valueOf(studName));
        System.out.println("Enter Student ID number ");
        studName = sc.nextLine ();
        studentScan.setId(Integer.parseInt(studName));
        System.out.println("Enter Student Group Name ");
        studName = sc.nextLine ();
        studentScan.setGroupName(studName);

       return studentScan;
    }
}
