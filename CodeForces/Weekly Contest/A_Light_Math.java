    import java.util.*;

    public class A_Light_Math {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt();
            while (T-- > 0) {
                long n = sc.nextLong();
                long t = sc.nextLong();
                long k = sc.nextLong();

                if (t > 2 * (k - 1)) {
                    System.out.println("NO");
                    continue;
                }

                boolean found = false;
                for (long i = 0; i < k && !found; i++) {
                    long j = t - i;
                    if (j >= 0 && j < k && j != i) {
                        if (i < n % k + 1 && j < n % k + 1) {
                            found = true;
                        }
                    }
                }

                if (found) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            sc.close();
        }
    }
