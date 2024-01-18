import java.util.Random;
import java.util.Scanner;

public class sdfsf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int toplamPara = 0;
        int kazanilanPara = 0;

        do {
            System.out.print("Kaç TL ile oynamak istersiniz? ");
            int para = scanner.nextInt();
            toplamPara += para;

            // Rastgele 3 kelime seçin
            String[] meyveler = {"çilek", "elma", "muz", "kiraz", "kavun"};
            String[] secilenMeyveler = new String[3];
            for (int i = 0; i < 3; i++) {
                int index = random.nextInt(meyveler.length);
                secilenMeyveler[i] = meyveler[index];
            }

            // Seçilen meyveleri ekrana yazdırın
            System.out.println("Seçilen meyveler: " + secilenMeyveler[0] + " " + secilenMeyveler[1] + " " + secilenMeyveler[2]);

            // Kazanılan parayı hesaplayın
            if (secilenMeyveler[0].equals(secilenMeyveler[1]) && secilenMeyveler[1].equals(secilenMeyveler[2])) {
                kazanilanPara = para * 3;
                System.out.println("Tebrikler! Üç " + secilenMeyveler[0] + " kazandınız. Kazandığınız para: " + kazanilanPara + " TL");
            } else if (secilenMeyveler[0].equals(secilenMeyveler[1]) || secilenMeyveler[1].equals(secilenMeyveler[2]) || secilenMeyveler[0].equals(secilenMeyveler[2])) {
                kazanilanPara = para * 2;
                System.out.println("Tebrikler! İki " + secilenMeyveler[0] + " kazandınız. Kazandığınız para: " + kazanilanPara + " TL");
            } else {
                kazanilanPara = 0;
                System.out.println("Maalesef hiçbir şey kazanamadınız. Kazandığınız para: " + kazanilanPara + " TL");
            }

            toplamPara -= para;
            toplamPara += kazanilanPara;

            System.out.print("Tekrar oynamak istiyor musunuz? (y/n): ");
            String cevap = scanner.next();
            if (!cevap.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);

        System.out.println("Toplam para harcanan: " + toplamPara + " TL");
        System.out.println("Toplam kazanılan para: " + kazanilanPara + " TL");
        System.out.println("Net kazanç: " + (kazanilanPara - toplamPara) + " TL");
    }
}
