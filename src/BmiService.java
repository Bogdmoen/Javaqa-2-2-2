public class BmiService {
    public String calculate(int weight, int height) {
        int height_multp = height * height;
        float bmi_value = (float) weight / (float) height_multp;
        return String.format("%.2f", bmi_value);
    }
}