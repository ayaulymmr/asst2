public class Employee extends Person {
    private String position;
    private double salary;

    // Constructors
    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    // Getters and setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Implementation of Payable interface method
    @Override
    public double getPaymentAmount() {
        return salary;
    }

    // Implementation of Comparable interface method
    @Override
    public int compareTo(Person otherPerson) {
        // Compare based on the amount of money they make
        if (otherPerson instanceof Employee) {
            return Double.compare(this.getSalary(), ((Employee) otherPerson).getSalary());
        } else {
            return 1;
        }
    }
}
