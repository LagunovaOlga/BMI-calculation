public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double result = service.calculate(56, 1.52);

        System.out.println("Ваш ИМТ составляет " + result);

    }
}
