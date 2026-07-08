public class TestEmployee {

    public static void main(String[] args) {

        // Creating Employee object
        Employee emp = new Employee(
                "Naveena",
                500000.0,
                2026,
                "NI123456");

        // Display Employee Details
        System.out.println("Employee Details");
        System.out.println("------------------------");
        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getNationalInsuranceNumber());
    }
}