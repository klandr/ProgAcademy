package hwTwo.classwork;

public class Employee extends Human {
    private int id;
    private String department;

    public Employee(String name, String lastName, int id, String department) {
        super(name, lastName);
        this.id = id;
        this.department = department;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+", "+"Employee{" +
                "id=" + id +
                ", department='" + department +  '\'' +
                '}';
    }
}
