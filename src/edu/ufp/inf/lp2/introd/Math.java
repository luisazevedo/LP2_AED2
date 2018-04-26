package edu.ufp.inf.lp2.introd;

public class Math {

    private int n;

    public static double fact_i(int n) {
        double f = 1;

        for (int i = 0; n > i; n--) {

            f *= n;

        }
        return f;
    }

    public static int fact_r(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fact_r(n - 1);

    }
}
