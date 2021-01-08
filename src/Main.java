public class Main {
    public static void main(String[] args) {
        Bmiservice service = new Bmiservice();
                double  bmi = service.colculate(170, 50);
        System.out.println(bmi);
    }
}
