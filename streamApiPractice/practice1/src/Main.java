import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        Employee emp1=new Employee(1,"Vivek","HR");
        Employee emp2=new Employee(1,"Abhishek","Engineer");
        Employee emp3=new Employee(1,"Ankit","HR");
        Employee emp4=new Employee(1,"Rachna","Engineer");

        Department dept1=new Department(1,"Engineer");
        dept1.addEmployees(emp1);
        dept1.addEmployees(emp2);

        Department dept2=new Department(1,"HR");
        dept2.addEmployees(emp3);
        dept2.addEmployees(emp4);

      //  Stream.of(dept1,dept2).map(n->n%2).

//       Map<String,Long> result= Stream.of(dept1,dept2).collect(Collectors.groupingBy(Department::getDeptName,Collectors.counting()));
//        System.out.println(result);


    }
}