import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 29, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 32, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 01, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        //Group the Employees by city

        Map<String,Long> result=empList.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));

        System.out.println(result);

        //Group the Employees by age.

        Map<Integer,Long> groupByAge=empList.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));

        System.out.println("groupByAge "+groupByAge);

        // Find the count of male and female employees present in the organization.

        Map<String,Long> maleAndFemalCount=empList.stream().collect(
                Collectors.groupingBy(Employee::getGender,Collectors.counting())
        );

        System.out.println("maleAndFemalCount "+maleAndFemalCount);

        //Print the names of all departments in the organization.

        List<String> deptList=empList.stream().map(Employee::getDeptName).distinct().collect(
                Collectors.toList()
        );

        System.out.println("deptList "+deptList);

        //Print employee details whose age is greater than 28.

        List<Employee> empDetailsage=empList.stream().filter(
                n->n.getAge()>28).collect(Collectors.toList());

        System.out.println("empDetailsage "+empDetailsage );

        //Find maximum age of employee.

        OptionalInt maxage=empList.stream().mapToInt(Employee::getAge).max();

        System.out.println(maxage);

        //Print Average age of Male and Female Employees.

        Map<String,Double> averageAge=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingLong(Employee::getAge)));
        System.out.println("averageAge "+averageAge);
        //Print the number of employees in each department.

        Map<String,Long> noOfEmployeeDept=empList.stream().collect(
                Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));

        System.out.println("noOfEmployeeDept "+noOfEmployeeDept);
        //Find oldest employee.

        Optional<Employee> oldestEmployee=empList.stream().max(Comparator.comparingInt(Employee::getAge));

        System.out.println("oldestEmployee "+oldestEmployee);
        //Find youngest female employee.

        Optional<Employee> youngestFemaleEmp=empList.stream()
                .filter(n->n.getGender()=="F")
                .min(Comparator.comparingInt(Employee::getAge));

        System.out.println("youngestFemaleEmp "+youngestFemaleEmp);

        //Find employees whose age is greater than 30 and less than 30.



        //Find the department name which has the highest number of employees.

        //Find if there any employees from HR Department.

        //Find the department names that these employees work for, where the number of employees in the department is over 3.


        //Find distinct department names that employees work for.

        //Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.


        //No of employees in the organisation.

        //Find employee count in every department

        //Find the department which has the highest number of employees.

        //Sorting a Stream by age and name fields.

        //Highest experienced employees in the organization.

        //Print average and total salary of the organization.

        //Print Average salary of each department.

        //Find Highest salary in the organisation.

        //Find Second Highest salary in the organisation.

        //Nth Highest salary.

        //Find highest paid salary in the organisation based on gender.

        //Find lowest paid salary in the organisation based in the organisation.

        //Sort the employees salary in the organisation in ascending order

        //Sort the employees salary in the organisation in descending order.

        // Highest salary based on department.

        //Print list of employee’s second highest record based on department

        //Sort the employees salary in each department in ascending order

        //Sort the employees salary in each department in descending order





    }
}