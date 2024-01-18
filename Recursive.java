public class Recursive {
    public static void main(String[] args) {
        int num1 = f(4);
        int num2 = f(3);
        System.out.println(num1);
        System.out.println(num2);
    }
    static int f(int x){
        int toplam = 0;
        for (int i = 1; i <= x; i++){
            toplam += i;
        }
        return toplam;
    }
}
