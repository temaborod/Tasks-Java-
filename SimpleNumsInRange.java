import java.util.ArrayList;
import java.util.Arrays;

public class SimpleNumsInRange {
    public static void main(String[] args){
        int min = 1;
        int max = 33;
        System.out.println(Arrays.toString(simpleNumsInRange(min, max)));
    }

    public static int[] simpleNumsInRange(int min, int max){
        // Создаем список для простых чисел
        ArrayList<Integer> commonDivisorsList = new ArrayList<>();

        // Находим простые числа в диапазоне
        for(int i=min; i<=max; i++){
            int countOfDivisors = 0;
            // Определяем количество делителей каждого числа
            for (int j=1; j<=i; j++){
                if(i%j==0){
                    countOfDivisors++;
                }
            }
            // Если у числа 2 делителя - оно простое, добавляем в список
            if(countOfDivisors==2){
                commonDivisorsList.add(i);
            }else continue;
        }

        // Преобразуем список в массив и возвращаем его
        int[] commonDivisorsArray = new int[commonDivisorsList.size()];
        for (int i = 0; i < commonDivisorsList.size(); i++) {
            commonDivisorsArray[i] = commonDivisorsList.get(i);
        }
        return commonDivisorsArray;
    }
}
