package ocp;

/**
 * Closed for modification: This class does not need to change
 * when we add a new type of insurance (e.g. HomeInsurance).
 */
public class PremiumCalculator {
    public double calculateTotalStartPremium(InsurancePolicy... policies) {
        double total = 0;
        for (InsurancePolicy policy : policies) {
            total += policy.calculatePremium();
        }
        return total;
    }
}
