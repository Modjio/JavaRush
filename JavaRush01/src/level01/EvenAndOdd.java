/*
Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
 */

package level01;

public class EvenAndOdd {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {
            if ((strings.length - i) % 2 == 0) {
                strings[i] = ODD;
            } else {
                strings[i] = EVEN;
            }
        }
        //код закончен
        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
