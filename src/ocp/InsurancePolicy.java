package ocp;

/**
 * Open for extension: You can create new implementations of this interface.
 * The consumer (Calculator) will not need to change.
 */
public interface InsurancePolicy {
    double calculatePremium();
}
