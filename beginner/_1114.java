package beginner;

import java.io.IOException;
import java.util.Scanner;

public class _1114 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    while (!"2002".equals(scanner.nextLine())) {
      System.out.println("Senha Invalida");
    }

    System.out.println("Acesso Permitido");

    scanner.close();
  }
}
