package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1012 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    final double PI = 3.14159;

    double A = scanner.nextDouble();
    double B = scanner.nextDouble();
    double C = scanner.nextDouble();

    double triangle = A * C / 2;
    double circle = PI * Math.pow(C, 2);
    double trapezium = (A + B) * C / 2;
    double square = Math.pow(B, 2);
    double rectangle = A * B;

    System.out.println("TRIANGULO: " + String.format("%.3f", triangle));
    System.out.println("CIRCULO: " + String.format("%.3f", circle));
    System.out.println("TRAPEZIO: " + String.format("%.3f", trapezium));
    System.out.println("QUADRADO: " + String.format("%.3f", square));
    System.out.println("RETANGULO: " + String.format("%.3f", rectangle));

    scanner.close();
  }
}
