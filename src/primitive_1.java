import java.util.Scanner;

public class primitive_1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            String result = "";
            if (i % 3 == 0) {
                result = "fizz ";
            }
            if (i % 5 == 0) {
                result = result + "buzz";
            }
            System.out.println("Число  " + i + " Результат: " + result);
            i++;
        }
    }
}

