import java.util.Scanner;

public class primitive_1 {
    public static void main(String[] args) {
        for (int i = 1; i<= 100; i++) {
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

