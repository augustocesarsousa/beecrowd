package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Neste problema você deve ler um número, indicando uma linha da matriz na qual
 * uma operação deve ser realizada, um caractere maiúsculo, indicando a operação
 * que será realizada, e todos os elementos de uma matriz M[12][12]. Em seguida,
 * calcule e mostre a soma ou a média dos elementos que estão na área verde da
 * matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do
 * valor 2 para a linha da matriz, demonstrando os elementos que deverão ser
 * considerados na operação.
 * 
 * Entrada
 * A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha
 * que será considerada para operação. A segunda linha de entrada contém um
 * único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou
 * Média) que deverá ser realizada com os elementos da matriz. Seguem os 144
 * valores de ponto flutuante que compõem a matriz, sendo que a mesma é
 * preenchida linha por linha, da linha 0 até a linha 11, sempre da esquerda
 * para a direita.
 * 
 * Saída
 * Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
 * decimal.
 */

public class _1181 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    double[][] M = new double[12][12];
    int L = scanner.nextInt();
    char T = scanner.next().charAt(0);
    double sum = 0;

    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        M[i][j] = scanner.nextDouble();

        if (L == i) {
          sum += M[i][j];
        }
      }
    }

    if ('S' == T) {
      System.out.println(String.format("%.1f", sum));
    } else {
      System.out.println(String.format("%.1f", sum / 12));
    }

    scanner.close();
  }
}
