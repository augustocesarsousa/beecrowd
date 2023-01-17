package beginner;

public class _1155 {

    public static void main(String[] args) {
        final double N = 1;
        double S = N;

        for (int i = 2; i <= 100; i++) {
            S += N/i;
        }
        
        System.out.printf("%.2f\n", S);
    }
}
