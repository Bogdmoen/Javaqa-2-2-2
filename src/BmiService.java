import java.math.BigDecimal;
import java.math.RoundingMode;

public class BmiService {
    public float calculate(int weight, int height) {
        weight = weight * 10000;
        int heightMultp = height * height;
        float bmiValue = (float) weight / heightMultp;
        float bmiValueRound = new BigDecimal(bmiValue).setScale(2, RoundingMode.HALF_DOWN).floatValue();
        return bmiValueRound;
    }
}