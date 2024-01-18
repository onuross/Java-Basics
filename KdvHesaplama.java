import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvFiyat, KDV = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün Tutarını Giriniz: ");
        tutar = input.nextDouble();
        kdvFiyat = tutar + tutar*KDV;
        System.out.println("kdvFiyat = " + kdvFiyat);
    }
}
