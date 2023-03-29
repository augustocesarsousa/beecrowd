package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a
 * ordem de uma matriz M de inteiros, e construa a matriz de acordo com o
 * exemplo abaixo.
 *
 * Entrada
 * A entrada consiste de vários inteiros, um valor por linha, correspondentes as
 * ordens das matrizes a serem construídas. O final da entrada é marcado por um
 * valor de ordem igual a zero (0).
 * 
 * Saída
 * Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o
 * exemplo. Os valores das matrizes devem ser formatados em um campo de tamanho
 * 3 justificados à direita e separados por espaço. Após o último caractere de
 * cada linha da matriz não deve haver espaços em branco. Após a impressão de
 * cada matriz deve ser deixada uma linha em branco.
 */

public class _1435 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int aux;

        while (N != 0) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    aux = i;

                    if (j < aux) {
                        aux = j;
                    }

                    if (N - i + 1 < aux) {
                        aux = N - i + 1;
                    }

                    if (N - j + 1 < aux) {
                        aux = N - j + 1;
                    }

                    System.out.printf("%3d", aux);

                    if (j < N) {
                        System.out.print(" ");
                    } else {
                        System.out.print("\n");
                    }
                }
            }
            System.out.print("\n");
            N = scanner.nextInt();
        }
        scanner.close();
    }
}
