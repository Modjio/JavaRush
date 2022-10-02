// Реализуй метод main(String[]), который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().

package level01;

import java.util.Arrays;

public class StringsInts {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //напишите тут ваш код
        String str = Arrays.toString(strings);
        System.out.println(str);

        String i = Arrays.toString(ints);
        System.out.println(i);

    }
}
