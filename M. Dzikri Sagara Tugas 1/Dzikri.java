import java.util.Scanner;

public class Dzikri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam fahrenhit: ");
        double fahrenhit = scanner.nextDouble();

        double celcius = (fahrenhit - 32) * 5 / 9;
        System.out.println("Hasil Konversi: " + celcius + " Celcius");

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;
        System.out.println("Hasil konversi: " + kelvin + " Kelvin");

        scanner.close();
    }
}
