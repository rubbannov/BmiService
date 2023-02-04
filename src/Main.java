public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println(service.calculate(101,1.76));
    }
}
