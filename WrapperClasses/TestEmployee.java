class Employee implements Cloneable {
    int empId;
    String name;
    double salary;

    // Constructor
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }

    // Clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        try {
            // Original object
            Employee emp1 = new Employee(101, "Naveena", 50000);

            // Clone object
            Employee emp2 = (Employee) emp1.clone();

            // Modify original object
            emp1.empId = 102;
            emp1.name = "Rahul";
            emp1.salary = 60000;

            // Display original object
            System.out.println("Original Employee:");
            emp1.display();

            // Display cloned object
            System.out.println("\nCloned Employee:");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}