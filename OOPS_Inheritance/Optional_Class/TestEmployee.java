import java.util.Optional;

// User-defined Exception
class InvalidEmployeeException extends Exception {

    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Employee Class
class Employee {

    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
    }
}

// Main Class
public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Invalid Employee"));

            employee.display();

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}