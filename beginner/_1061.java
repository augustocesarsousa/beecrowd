package beginner;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Pedrinho está organizando um evento em sua Universidade. O evento deverá ser
 * no mês de Abril, iniciando e terminando dentro do mês. O problema é que
 * Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe
 * quando inicia e quando termina o evento.
 * 
 * Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá
 * ajudar Pedrinho a calcular a duração deste evento.
 * 
 * Entrada
 * Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um
 * espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será
 * informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na
 * terceira e quarta linha de entrada haverá outra informação no mesmo formato
 * das duas primeiras linhas, indicando o término do evento.
 * 
 * Saída
 * Na saída, deve ser apresentada a duração do evento, no seguinte formato:
 * 
 * W dia(s)
 * X hora(s)
 * Y minuto(s)
 * Z segundo(s)
 * 
 * Obs: Considere que o evento do caso de teste para o problema tem duração
 * mínima de 1 minuto.
 */

public class _1061 {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String[] dayOne = scanner.nextLine().split(" ");
    String[] dayOneTime = scanner.nextLine().replaceAll(" ", "").split(":");
    String[] dayTwo = scanner.nextLine().split(" ");
    String[] dayTwoTime = scanner.nextLine().replaceAll(" ", "").split(":");

    LocalDateTime day1 = LocalDateTime.of(1970, 1,
        Integer.parseInt(dayOne[1]),
        Integer.parseInt(dayOneTime[0]),
        Integer.parseInt(dayOneTime[1]),
        Integer.parseInt(dayOneTime[2]));

    LocalDateTime day2 = LocalDateTime.of(1970, 1,
        Integer.parseInt(dayTwo[1]),
        Integer.parseInt(dayTwoTime[0]),
        Integer.parseInt(dayTwoTime[1]),
        Integer.parseInt(dayTwoTime[2]));

    Duration duration = Duration.between(day1, day2);

    long days = duration.toDays();
    duration = duration.minusDays(days);

    long hours = duration.toHours();
    duration = duration.minusHours(hours);

    long minutes = duration.toMinutes();
    duration = duration.minusMinutes(minutes);

    long seconds = duration.toSeconds();
    duration = duration.minusSeconds(seconds);

    System.out.printf("%d dia(s)%n", days);
    System.out.printf("%d hora(s)%n", hours);
    System.out.printf("%d minuto(s)%n", minutes);
    System.out.printf("%d segundo(s)%n", seconds);
    scanner.close();
  }
}
