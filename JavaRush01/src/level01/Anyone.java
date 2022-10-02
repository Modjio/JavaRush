/*
Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится в переданном массиве, иначе — false.
Массив array не должен изменять расположение своих элементов.

Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать, используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
Первым параметром нужно передать отсортированный массив, в котором выполнить поиск, вторым параметром — искомый элемент.
Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента, если такой элемент есть в массиве.

Для сортировки массива можно использовать метод Arrays.sort(int[]).
 */

package level01;

import java.util.Arrays;

public class Anyone {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        Arrays.sort(arrayCopy);

        int result = Arrays.binarySearch(arrayCopy, element);

        System.out.println(result >= 0);
    }
}
