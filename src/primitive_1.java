import java.util.Scanner;

public class primitive_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число до которого хотите проверить кратность: ");
        int e = in.nextInt();
        for (int i = 1; i<= e; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = "fizz ";
            }
            if (i % 5 == 0) {
                result = result + "buzz";
            }
            System.out.println("Число  " + i + " Результат: " + result);
        }
    }
}

