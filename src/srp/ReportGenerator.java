package srp;

/**
 * Responsibility: Formatting and generating reports.
 * Segregates presentation logic from business logic.
 */
public class ReportGenerator {

    public String generateReport(Employee employee, double pay) {
        // Using Java Text Blocks for cleaner formatting
        return """
                ===================================
                EMPLOYEE REPORT
                ===================================
                ID:          %s
                Name:        %s
                Department:  %s
                Hours:       %d
                Total Pay:   $%.2f
                ===================================
                """.formatted(
                employee.id(),
                employee.name(),
                employee.department(),
                employee.hoursWorked(),
                pay);
    }
}
