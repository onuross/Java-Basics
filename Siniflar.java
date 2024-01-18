public class Siniflar {
    public static void main(String[] args) {
        /*HesapMakSinif makine1 = new HesapMakSinif();
        makine1.sayi1 = 10;
        makine1.sayi2 = 20;

        HesapMakSinif makine2 = new HesapMakSinif();
        makine2.sayi1 = 20;
        System.out.println(makine2.sayi1); */

        /*HesapMakSinif makine1;
        makine1 = new HesapMakSinif(1,3);
        makine1.sayi1 = 5;
        System.out.println(makine1.sayi1 + makine1.sayi2);*/

        HesapMakSinif m1 = new HesapMakSinif(10,5,"mavi");
        System.out.println(m1.toplama());
    }
}
