public class Overloading {
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + 3*c;
    }
    static double add(int a, int b, double c){
        return a + b + 2*c;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,5));
        System.out.println(add(1,2,7.0));

    }
}
