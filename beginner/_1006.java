package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um
 * aluno. A seguir, calcule
 * a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a
 * nota C tem peso 5.
 * Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 *
 * Entrada
 * O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão
 * (double).
 *
 * Saída
 * Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1
 * dígito após o ponto
 * decimal e com um espaço em branco antes e depois da igualdade. Assim como
 * todos os problemas, não
 * esqueça de imprimir o fim de linha após o resultado, caso contrário, você
 * receberá "Presentation
 * Error".
 */

public class _1006 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    final double p1 = 2;
    final double p2 = 3;
    final double p3 = 5;
    double a, b, c, avg;

    a = scanner.nextDouble();
    b = scanner.nextDouble();
    c = scanner.nextDouble();
    avg = (a * p1 + b * p2 + c * p3) / (p1 + p2 + p3);

    System.out.println("MEDIA = " + String.format("%.1f", avg));

    scanner.close();
  }
}
