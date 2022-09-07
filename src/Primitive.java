import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое хотите поделить:");
        String result = "";
        int c = in.nextInt();
        if (c % 3 == 0) {
            if (c % 5 == 0) {
                result = "fizz buzz";
            } else {
                result = "fizz";
            }
        } else {
            if (c % 5 == 0) {
                result = "buzz";
            } else {
                result = "Не делится не на 3 не на 5";
            }
        }
        System.out.println(result);
    }
}
