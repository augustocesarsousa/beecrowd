package beginner;

import java.io.IOException;
import java.util.Scanner;

/**
 * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a
 * 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A
 * tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma
 * que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 * 
 * Entrada
 * O arquivo de entrada contém 2 valores com uma casa decimal cada um.
 * 
 * Saída
 * Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5
 * dígitos após o ponto decimal e com um espaço em branco antes e depois da
 * igualdade. Utilize variáveis de dupla precisão (double) e como todos os
 * problemas, não esqueça de imprimir o fim de linha após o resultado, caso
 * contrário, você receberá "Presentation Error".
 */

public class _1005 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        final double p1 = 3.5;
        final double p2 = 7.5;
        double a, b, avg;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        avg = (a * p1 + b * p2) / (p1 + p2);

        System.out.println("MEDIA = " + String.format("%.5f", avg));

        scanner.close();
    }

}