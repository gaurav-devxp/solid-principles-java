package ocp;

public class HealthInsurance implements InsurancePolicy {
    private final int age;
    private final boolean isSmoker;

    public HealthInsurance(int age, boolean isSmoker) {
        this.age = age;
        this.isSmoker = isSmoker;
    }

    @Override
    public double calculatePremium() {
        double base = 500;
        if (age > 50)
            base += 200;
        if (isSmoker)
            base += 300;
        return base;
    }
}
