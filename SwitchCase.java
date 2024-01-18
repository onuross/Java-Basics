import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int sayi = input.nextInt();
        switch (sayi) {
            case 1:
                System.out.println("Sayı = 1");
                break;
            case 2:
                System.out.println("Sayı = 2");
                break;
            case 3:
                System.out.println("Sayı = 3");
                break;
            default:
                System.out.println("Sayı ne bilm");
        }
    }
}
