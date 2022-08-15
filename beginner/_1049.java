package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * _1049
 */
public class _1049 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    String nivel1 = scanner.next();
    String nivel2 = scanner.next();
    String nivel3 = scanner.next();

    switch (nivel1) {
      case "vertebrado":
        switch (nivel2) {
          case "ave":
            switch (nivel3) {
              case "carnivoro":
                System.out.println("aguia");
                break;
              case "onivoro":
                System.out.println("pomba");
                break;
              default:
                break;
            }
            break;
          case "mamifero":
            switch (nivel3) {
              case "onivoro":
                System.out.println("homem");
                break;
              case "herbivoro":
                System.out.println("vaca");
                break;
              default:
                break;
            }
            break;
          default:
            break;
        }
        break;
      case "invertebrado":
        switch (nivel2) {
          case "inseto":
            switch (nivel3) {
              case "hematofago":
                System.out.println("pulga");
                break;
              case "herbivoro":
                System.out.println("lagarta");
                break;
              default:
                break;
            }
            break;
          case "anelideo":
            switch (nivel3) {
              case "hematofago":
                System.out.println("sanguessuga");
                break;
              case "onivoro":
                System.out.println("minhoca");
                break;
              default:
                break;
            }
            break;
          default:
            break;
        }
        break;
      default:
        break;
    }

    scanner.close();
  }
}
