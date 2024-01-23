public class Student extends Person {
    private double gpa;

    // Constructors
    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    // toString method
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Getters and setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Implementation of Payable interface method
    @Override
    public double getPaymentAmount() {
        // Stipend is given in case student has GPA > 2.67
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }

    // Implementation of Comparable interface method
    @Override
    public int compareTo(Person otherPerson) {
        // Compare based on the amount of money they make
        if (otherPerson instanceof Student) {
            return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
        } else {
            return 1;
        }
    }
}
