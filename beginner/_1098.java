package beginner;

import java.io.IOException;
import java.text.DecimalFormat;

public class _1098 {

  public static void main(String[] args) throws IOException {
    DecimalFormat df = new DecimalFormat("0.0");
    double i = 0d;
    double j = 1d;
    while (i <= 2) {
      for (int x = 0; x < 3; x++) {
        if (df.format(i).endsWith("0")) {
          System.out.println("I=" + df.format(i).substring(0, 1) + " J=" + df.format(j).substring(0, 1));
        } else {
          System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j));
        }
        j++;
      }
      j -= 3;
      i += 0.2;
      j += 0.2;
    }
  }
}
