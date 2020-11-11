package WeekTwo.OOP;

public class Employee {
    /*
    1. Create global and local variables
    2. Static and non static variables
    3. Non-arg and args constructor
    4. Static and non static method (with void and return type)
     */
    // When to create static variables
    static int empID;
    static String empOfficeCode;
    static String empLotID;
    // when to create non static variables
    String empName;
    String empDept;
    boolean isActive;
    int empZipCode;

    // 1. we cannot use static variable in constructors
    public Employee() {
        System.out.println("This is no-args constructior..");
    }
    public Employee(String name, String dept, int zipCode) {
        empName = name;
        empDept = dept;
        empZipCode = zipCode;
    }
    //non-static method
    public double empIncome(double income) {
        System.out.println(empName);
        System.out.println(empDept);
        return income / 2;
    }
    public static String empDetails() {
        return empOfficeCode + " " + empLotID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", isActive=" + isActive +
                ", empZipCode=" + empZipCode +
                '}';
    }
}
