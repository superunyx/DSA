import java.util.*;

//
// Strassen's Matrix Multiplication Algorithm (2x2)
public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] x = {{1, 2}, {3, 4}};
        int[][] y = {{5, 6}, {7, 8}};
        int[][] z = new int[2][2];

        int a = x[0][0];
        int b = x[0][1];
        int c = x[1][0];
        int d = x[1][1];

        int e = y[0][0];
        int f = y[0][1];
        int g = y[1][0];
        int h = y[1][1];

        int m1 = (a + d) * (e + h);
        int m2 = (c + d) * e;
        int m3 = a * (f - h);
        int m4 = d * (g - e);
        int m5 = (a + b) * h;
        int m6 = (c - a) * (e + f);
        int m7 = (b - d) * (g + h);

        z[0][0] = m1 + m4 - m5 + m7;
        z[0][1] = m3 + m5;
        z[1][0] = m2 + m4;
        z[1][1] = m1 - m2 + m3 + m6;

        System.out.println(z[0][0] + "\t" + z[0][1]);
        System.out.println(z[1][0] + "\t" + z[1][1]);
    }
}
