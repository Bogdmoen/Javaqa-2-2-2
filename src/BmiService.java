public class BmiService {
    public String calculate(int weight, int hight) {
        int hight_multp = hight * hight;
        float bmi_value = (float) weight / (float) hight_multp;
        return String.format("%.2f", bmi_value);
    }
}