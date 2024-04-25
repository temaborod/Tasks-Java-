import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDivisor {
    public static void main(String[] args){
        int[] mas = {42, 12, 18};
        System.out.println(Arrays.toString(commonDivisors(mas)));
    }

    public static int[] commonDivisors(int[] arr){
        if (arr == null || arr.length == 0) {
            return new int[0]; // возвращаем пустой массив, если входной массив пуст или равен null
        }

        // Находим минимальное число в массиве
        int minNumber = Arrays.stream(arr).min().getAsInt();

        // Создаем список для общих делителей
        ArrayList<Integer> commonDivisorsList = new ArrayList<>();

        // Проверяем каждое число от 1 до минимального числа в массиве
        for (int i = 2; i <= minNumber; i++) {
            boolean isCommonDivisor = true;
            // Проверяем, делится ли каждое число в массиве на текущее число
            for (int num : arr) {
                if (num % i != 0) {
                    isCommonDivisor = false;
                    break; // если хотя бы одно число не делится, выходим из внутреннего цикла
                }
            }
            // Если текущее число является общим делителем для всех чисел в массиве, добавляем его в список
            if (isCommonDivisor) {
                commonDivisorsList.add(i);
            }
        }

        // Преобразуем список в массив и возвращаем его
        int[] commonDivisorsArray = new int[commonDivisorsList.size()];
        for (int i = 0; i < commonDivisorsList.size(); i++) {
            commonDivisorsArray[i] = commonDivisorsList.get(i);
        }
        return commonDivisorsArray;
    }

}
