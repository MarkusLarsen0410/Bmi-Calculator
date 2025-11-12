public class BMI {


    double height;
    double weight;


    public BMI()
    {
        this.height = height;
        this.weight = weight;
    }

    public Double calculateBmi(double weight, double height){

        return weight/(Math.pow(height, 2));
    }



}
