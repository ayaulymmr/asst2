interface Payable {
    double getPaymentAmount();
}

public class Person implements Comparable<Person>, Payable {
    private static int nextId = 1;

    private int id;
    private String name;
    private String surname;

    // Constructors
    public Person() {
        this.id = nextId++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    // toString method
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // getPosition method
    public String getPosition() {
        return "Student";
    }

    // Implementation of Payable interface method
    @Override
    public double getPaymentAmount() {
        // Default implementation for Person (can be overridden in subclasses)
        return 0.00;
    }

    // Implementation of Comparable interface method
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}