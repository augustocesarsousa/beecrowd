package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1134 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    int input = 0;

    while ((input = scanner.nextInt()) != 4) {
      switch (input) {
        case 1:
          alcool++;
          break;
        case 2:
          gasolina++;
          break;
        case 3:
          diesel++;
          break;
        default:
          break;
      }
    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    scanner.close();
  }
}
