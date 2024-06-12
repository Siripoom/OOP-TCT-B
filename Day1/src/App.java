import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            double celsius = getCelsius(scanner);
            double fahrenheit = convertCelsiustoFahrenheit(celsius);
            displayResult(celsius, fahrenheit);
        } finally {
            scanner.close();
        }
    }

    public static double getCelsius(Scanner scanner) {
        System.out.println("Enter celsius");
        double celsius = scanner.nextDouble();
        return celsius;
    }

    public static double convertCelsiustoFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void displayResult(double celsius, double fahrenheit) {
        System.out.printf("%.2f degree celsius is equal to %.2f degrees fahrenheit", celsius, fahrenheit);
    }

}