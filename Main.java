import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double score1 = sc.nextDouble();
            double score2 = sc.nextDouble();
            double score3 = sc.nextDouble();
            double finalScore = (score1 * 2.0 + score2 * 3.0 + score3 * 5.0) / 10.0;
            System.out.printf("%.1f%n", finalScore);
        }

        sc.close();
    }
}