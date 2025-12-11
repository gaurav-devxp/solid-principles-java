package srp;

/**
 * Record representing the data of an Employee.
 * Doing one thing: Holding Data.
 */
public record Employee(String id, String name, String department, double hourlyRate, int hoursWorked) {
}
