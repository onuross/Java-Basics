import java.util.Scanner;

public class DaireCevresiAlanı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double cevre, alan, pi = 3.14;

        System.out.print("r :");
        r = input.nextInt();
        cevre = 2 * pi * r;
        alan = pi * (r*r);
        System.out.println("Cevre:"+cevre);
        System.out.println("Alan = " + alan);
    }
}
