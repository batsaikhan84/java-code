package WeekTwo.OOP.Encapsulation;

public class IntroEncapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(101);
        System.out.println(student.getId());

    }
}
class Student {
    int id;
    String fullName;
    String department;
    boolean isActive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department='" + department + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
