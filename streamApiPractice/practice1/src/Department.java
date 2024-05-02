import java.util.ArrayList;
import java.util.List;

public class Department {

    int id;
    String deptName;
    List<Employee> employees;

    public Department(int id, String deptName) {
        this.id = id;
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employees = employee;
    }

    public void addEmployees(Employee employee){
        employees.add(employee);
    }


}
