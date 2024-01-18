import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int[] notes = new int[5];
        double result = 0;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("***Enter Notes***");
        System.out.print("Math :");
        notes[0] = input.nextInt();
        System.out.print("Physics :");
        notes[1] = input.nextInt();
        System.out.print("Bio :");
        notes[2] = input.nextInt();
        System.out.print("Discrete :");
        notes[3] = input.nextInt();
        System.out.print("CS :");
        notes[4] = input.nextInt();

        for (int not : notes) {
            total += not;
        }
        System.out.println("Average = " + (total/ notes.length));


    }
}
