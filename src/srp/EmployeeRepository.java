package srp;

/**
 * Responsibility: Data persistence.
 * Segregates database operations from business logic.
 */
public class EmployeeRepository {

    public void save(Employee employee) {
        // Simulating DB save
        System.out.println("Saving employee to database: " + employee);
    }

    public Employee findById(String id) {
        // Simulating DB fetch
        return new Employee(id, "John Doe", "Engineering", 50.0, 45);
    }
}
