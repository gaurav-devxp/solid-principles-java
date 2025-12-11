package srp;

public class SrpDemo {
    public static void main(String[] args) {
        System.out.println("--- Single Responsibility Principle Demo ---");

        // 1. Create Data
        Employee emp = new Employee("E123", "Alice Smith", "IT", 60.0, 42);

        // 2. Persist Data (Repository responsibility)
        EmployeeRepository repo = new EmployeeRepository();
        repo.save(emp);

        // 3. Calculate Logic (Calculator responsibility)
        PayrollCalculator calculator = new PayrollCalculator();
        double pay = calculator.calculatePay(emp);

        // 4. Generate Output (Reporter responsibility)
        ReportGenerator interaction = new ReportGenerator();
        String report = interaction.generateReport(emp, pay);

        System.out.println(report);
    }
}
