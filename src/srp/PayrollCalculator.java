package srp;

/**
 * Responsibility: Calculating pay.
 * Segregates business logic from data and persistence.
 */
public class PayrollCalculator {

    public double calculatePay(Employee employee) {
        // Business logic for pay calculation
        double basePay = employee.hourlyRate() * employee.hoursWorked();
        
        // Simulating some overtime logic
        if (employee.hoursWorked() > 40) {
            double overtime = (employee.hoursWorked() - 40) * employee.hourlyRate() * 0.5;
            return basePay + overtime;
        }
        
        return basePay;
    }
}
