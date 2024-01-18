public class Metotlar {
    public static void main(String[] args) {
         f(4);
         power(2,3);
    }
    static void f(int x){
        int result = (x+2)*6;
        System.out.println("result = " + result);
    }
    static void power(int number1, int number2){
        int result = 1;
        for(int i = 1; i <= number2; i++){
            result *= number1;
        }
        System.out.println("result = " + result);
    }
}
