package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1050
 */
public class _1050 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int ddd = scanner.nextInt();

    switch (ddd) {
      case 11:
        System.out.println("Sao Paulo");
        break;
      case 19:
        System.out.println("Campinas");
        break;
      case 21:
        System.out.println("Rio de Janeiro");
        break;
      case 27:
        System.out.println("Vitoria");
        break;
      case 31:
        System.out.println("Belo Horizonte");
        break;
      case 32:
        System.out.println("Juiz de Fora");
        break;
      case 61:
        System.out.println("Brasilia");
        break;
      case 71:
        System.out.println("Salvador");
        break;
      default:
        System.out.println("DDD nao cadastrado");
        break;
    }

    scanner.close();
  }
}
