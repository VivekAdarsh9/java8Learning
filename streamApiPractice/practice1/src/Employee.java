public class Employee {
    int id;
    String employeeName;
    String department;

    public Employee(int id, String name,String department){
        this.id=id;
        this.employeeName=name;
        this.department=department;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
