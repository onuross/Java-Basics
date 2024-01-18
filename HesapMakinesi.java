import java.util.Objects;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        String islem;
        System.out.print("İlk sayı:");
        sayi1 = scan.nextInt();
        System.out.print("İkinci sayı:");
        sayi2 = scan.nextInt();
        System.out.print("İşlem:");
        islem = input.nextLine();

        if (Objects.equals(islem, "+")){
            System.out.println("Toplam:" + (sayi1 +sayi2));
        }else if(Objects.equals(islem, "-")){
            System.out.println("Cıkarma:" + (sayi1-sayi2));
        }else if(Objects.equals(islem, "*")){
            System.out.println("Carpma:" + (sayi1 * sayi2));
        }else if(islem.equals("/")){
            if (sayi2 == 0) {
                System.out.println("Sayi 2");
            }else{
                System.out.println("Bolme:" + (sayi1/sayi2));
            }
        }else{
            System.out.println("Gecersiz");
        }
    }
}
