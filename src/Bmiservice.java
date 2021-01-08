public class Bmiservice {
    public double colculate(double growth, double weight) {
        double bmi = (weight / (growth * growth)) * 100 * 100;
        return bmi;
    }
}
