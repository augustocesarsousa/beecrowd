package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
 * uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
 * considerando somente aqueles elementos que estão na área inferior da matriz,
 * conforme ilustrado abaixo (área verde).
 * 
 * Entrada
 * A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou
 * 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os
 * elementos da matriz. Seguem os 144 valores de ponto flutuante de dupla
 * precisão (double) que compõem a matriz.
 * 
 * Saída
 * Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
 * decimal.
 * 
 */

public class _1188 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    char O = scanner.next().charAt(0);
    double[][] M = new double[12][12];
    double sum = 0, avarage = 0;

    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M.length; j++) {
        M[i][j] = scanner.nextDouble();

        if (j < i && j < (M.length - i - 1)) {
          sum += M[i][j];
          avarage++;
        }
      }
    }

    if ('M' == O) {
      sum = sum / avarage;
    }

    System.out.println(String.format("%.1f", sum));

    scanner.close();
  }
}
