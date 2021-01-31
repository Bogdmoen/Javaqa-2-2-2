public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmiValue1 = service.calculate(70, 195);
        System.out.println(bmiValue1);

        float bmiValue2 = service.calculate(75, 180);
        System.out.println(bmiValue2);
    }
}
