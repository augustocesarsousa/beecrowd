package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Faça um programa que leia um valor e apresente o número de Fibonacci
 * correspondente a este valor lido. Lembre que os 2 primeiros elementos da
 * série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a
 * ele. Todos os valores de Fibonacci calculados neste problema devem caber em
 * um inteiro de 64 bits sem sinal.
 * 
 * Entrada
 * A primeira linha da entrada contém um inteiro T, indicando o número de casos
 * de teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60),
 * correspondente ao N-esimo termo da série de Fibonacci.
 * 
 * Saída
 * Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é
 * o N-ésimo termo da série de Fibonacci.
 */

public class _1176 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    long[] fibonacci = new long[61];
    int T = scanner.nextInt();
    int number;

    fibonacci[0] = 0;
    fibonacci[1] = 1;

    for (int i = 2; i < fibonacci.length; i++) {
      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    for (int i = 0; i < T; i++) {
      number = scanner.nextInt();
      System.out.printf("Fib(%d) = %d%n", number, fibonacci[number]);
    }

    scanner.close();
  }
}
