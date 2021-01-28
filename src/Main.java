public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        String bmi_value1 = service.calculate(70_0000, 195);
        System.out.println(bmi_value1);

        String bmi_value2 = service.calculate(75_0000, 180);
        System.out.println(bmi_value2);
    }
}
