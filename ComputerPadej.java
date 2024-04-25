import  java.util.Scanner;

public class ComputerPadej {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(computer(x));
    }

    public static String computer(int number){
        // Получаем последнюю цифру числа
        int lastDigit = number % 10;
        // Получаем две последние цифры числа
        int lastTwoDigits = number % 100;

        // Проверяем несколько случаев для определения склонения
        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            // Если число  11, 12, 13, 14, ..., 19 используем форму "компьютеров"
            return number + " компьютеров";
        } else if (lastDigit == 1) {
            // Если число оканчивается на 1, используем форму "компьютер"
            return number + " компьютер";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            // Если число оканчивается на 2, 3, 4, используем форму "компьютера"
            return number + " компьютерa";
        } else {
            // Во всех остальных случаях используем форму "компьютеров"
            return number + " компьютеров";
        }
    }
}