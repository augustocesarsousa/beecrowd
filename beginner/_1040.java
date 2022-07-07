package beginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class _1040 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();
        double exame, media;
        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);
        System.out.println("Media: " + df.format(media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media < 7) {
            System.out.println("Aluno em exame.");
            exame = scanner.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));
            media = (media + exame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(media));
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }
}
