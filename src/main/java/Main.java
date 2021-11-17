import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GCD(341, 217);
        GCD(465, 165);
        GCD(2030,899);
        GCD(188,158);

    }

    public static int GCD(int a, int b) {
        System.out.format("%3s %6s %4s %4s %4s %n", "i", "r", "q", "s", "t");

        int i = -1;
        int previousR = a, r = b;
        int sMinusOne = 1, s = 0;
        int tMinusOne = 0, t = 1;
        int q = 0;

        // First two lines
        System.out.format("%3d %6d %4d %4d %4d %n", i, previousR, q, sMinusOne, tMinusOne);
        System.out.format("%3d %6d %4d %4d %4d %n", ++i, r, q, s, t);

        while(r != 0) {
            i++;

            int tmp = r;
            q = previousR / r;
            r = previousR % r;
            previousR = tmp;

            // Calculating s
            tmp = s;
            s = sMinusOne - q * s;
            sMinusOne = tmp;

            // Calculating t
            tmp = t;
            t = tMinusOne - q * t;
            tMinusOne = tmp;

            // Printing out each line
            System.out.format("%3d %6d %4d %4d %4d %n", i, r, q, s, t);
        }

        // Print out result
        System.out.println("GCD is: " + previousR + "\n");

        return  previousR;
    }
}
