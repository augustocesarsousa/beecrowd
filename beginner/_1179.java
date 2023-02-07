package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme
 * estes valores forem pares ou ímpares. Só que o tamanho de cada um dos dois
 * vetores é de 5 posições. Então, cada vez que um dos dois vetores encher, você
 * deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números
 * que forem lidos. Terminada a leitura, deve-se imprimir o conteúdo que restou
 * em cada um dos dois vetores, imprimindo primeiro os valores do vetor impar.
 * Cada vetor pode ser preenchido tantas vezes quantas for necessário.
 * 
 * Entrada
 * A entrada contém 15 números inteiros.
 * 
 * Saída
 * Imprima a saída conforme o exemplo abaixo.
 */

public class _1179 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int number;
    int[] pair = new int[5];
    int[] odd = new int[5];

    for (int i = 0, j = 0, k = 0; i < 15;) {
      number = scanner.nextInt();

      if (number % 2 == 0) {
        pair[j] = number;
        j++;
      } else {
        odd[k] = number;
        k++;
      }

      if (j == 5) {
        printVector(pair, "par", j);
        j = 0;
      }

      if (k == 5) {
        printVector(odd, "impar", k);
        k = 0;
      }

      i++;
      if (i == 15) {
        printVector(odd, "impar", k);
        printVector(pair, "par", j);
      }

    }

    scanner.close();
  }

  public static void printVector(int[] vector, String text, int index) {
    for (int i = 0; i < index; i++) {
      System.out.printf("%s[%d] = %d%n", text, i, vector[i]);
    }
  }
}
