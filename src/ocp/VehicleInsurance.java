package ocp;

public class VehicleInsurance implements InsurancePolicy {
    private final int vehicleAge;
    private final int driverExperiencePoints;

    public VehicleInsurance(int vehicleAge, int driverExperiencePoints) {
        this.vehicleAge = vehicleAge;
        this.driverExperiencePoints = driverExperiencePoints;
    }

    @Override
    public double calculatePremium() {
        double base = 1000;
        // Older vehicles cost more to insure (simplification)
        if (vehicleAge > 10)
            base *= 1.2;
        // Good drivers get discount
        if (driverExperiencePoints > 5)
            base *= 0.9;
        return base;
    }
}
