import java.util.Scanner;

public class primitive_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int c = in.nextInt();
        String result = "";
        if (c % 3 == 0){
            result = "fizz ";
        }
        if (c % 5 == 0){
            result = result + "buzz";
        }
        System.out.println(result);
    }
}