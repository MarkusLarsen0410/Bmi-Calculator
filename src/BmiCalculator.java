public class BmiCalculator {



    public static double calculateBmi(double weight, double height){

        System.out.println("CalculateBmi weight: " + weight);
        double bmi = weight / (height * height);
        System.out.println("Calculated BMI:" + bmi);

        return bmi;
    }
}
