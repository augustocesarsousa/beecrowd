package beginner;

public class _1156 {

    public static void main(String[] args) {
        double N = 2;
        double S = 1;

        for (int i = 3; i <= 39; i += 2) {
            S += i / N;
            N *= 2;
        }

        System.out.printf("%.2f\n", S);
    }
}
