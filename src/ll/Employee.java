package ll;

public class Employee {
    // Private fields
    private String firstName;
    private String lastName;
    private int id;

    // Constructor
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Override toString method to display Employee information
    @Override
    public String toString() {
        return "Employee{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}

