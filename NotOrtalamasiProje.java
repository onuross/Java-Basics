import java.util.Scanner;

public class NotOrtalamasiProje {
    public static void main(String[] args) {
        int quiz;
        int vize;
        int finalNot;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Quiz Notunu Giriniz: ");
        quiz = input.nextInt();
        System.out.print("Vize Notunu Giriniz: ");
        vize = input.nextInt();
        System.out.print("Final Notunu Giriniz: ");
        finalNot = input.nextInt();

        ortalama = quiz*0.2 + vize*0.35 + finalNot*0.45;
        System.out.println("ortalama = " + ortalama);
        String sonuc = (ortalama >= 50) ? "Geçtiniz" : "Kaldınız";
        System.out.println("sonuc = " + sonuc);
    }

}
