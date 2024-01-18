public class ReturnMetotlar {
    public static void main(String[] args) {
        int r = power(2,3);

    }
     static int power(int number1, int number2){
        int result = 1;
        for(int i=1; i <= number2; i++){
            result *= number1;
        }
        return result;
    }
}
