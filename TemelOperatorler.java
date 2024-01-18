public class TemelOperatorler {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int toplam = a + b;
        System.out.println("toplam = " + toplam);
        int cikarma = a - b;
        System.out.println("cikarma = " + cikarma);
        int carpma = a * b;
        System.out.println("carpma = " + carpma);
        int bolme = a / b;
        System.out.println("bolme = " + bolme);
        int mod = a % b;
        System.out.println("mod = " + mod);
        toplam++;
        System.out.println("toplam = " + toplam);
        cikarma--;
        System.out.println(cikarma);
        int sonuc = a++ + b--;
        System.out.println("sonuc = " + sonuc);
        System.out.println(a);
        System.out.println(b);
        
        
        int sayi1 = 10;
        int sayi2 = 5;
        boolean kosul1 = (sayi1 == sayi2);
        System.out.println("kosul1 = " + kosul1);
        
        boolean kosul2 = (sayi1 > sayi2);
        boolean kosul3 = (sayi2 < sayi1);
        
        boolean sonuc2 = kosul2 && kosul3;
        System.out.println("sonuc2 = " + sonuc2);
        
        sonuc2 = kosul2 || kosul3;
        System.out.println("sonuc2 = " + sonuc2);
        
        String sonuc3 = (kosul2) ? "Dogru" : "Yanlış";
        System.out.println("sonuc3 = " + sonuc3);

        sayi1 = sayi2;
        System.out.println(sayi1);
        sayi1 += 2;
        System.out.println(sayi1);
        
    }
}
