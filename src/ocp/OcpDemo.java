package ocp;

public class OcpDemo {
    public static void main(String[] args) {
        System.out.println("--- Open/Closed Principle Demo ---");

        InsurancePolicy health = new HealthInsurance(55, false); // 500 + 200 = 700
        InsurancePolicy vehicle = new VehicleInsurance(5, 10); // 1000 * 0.9 = 900

        PremiumCalculator calculator = new PremiumCalculator();
        double total = calculator.calculateTotalStartPremium(health, vehicle);

        System.out.println("Total Premium: $" + total);

        // If we add HomeInsurance, we just create the class and pass it in.
        // No changes needed in PremiumCalculator.
    }
}
