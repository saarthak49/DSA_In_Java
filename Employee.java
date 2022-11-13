public class Employee {
    String name;
    Integer salary;

    public Employee() {
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
