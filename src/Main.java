import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Create several employees and students
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Student student1 = new Student("Ringo", "Starr", 2.5);
        Student student2 = new Student("Paul", "McCartney", 3.5);

        // Create an ArrayList<Person> with all employees and students
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(student1);
        peopleList.add(employee1);
        peopleList.add(student2);
        peopleList.add(employee2);

        Collections.sort(peopleList);

        // Call the printData method
        printData(peopleList);
    }

    // printData method
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            String formattedEarnings = String.format("%.2f", person.getPaymentAmount());
            System.out.println(person.toString() + " earns " + formattedEarnings + " tenge");
        }
    }
}
