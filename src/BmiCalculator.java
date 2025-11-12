public class BmiCalculator {

    public static void main(String[] args) {

        double height = 1.81;
        double weight = 95;
        double bmi = weight/(Math.pow(height, 2));
        System.out.println("Din bmi er: " + bmi);
    }
}
