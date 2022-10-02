package level01;

import java.util.Scanner;

public class MassArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner input = new Scanner(System.in);

        multiArray = new int[input.nextInt()][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[input.nextInt()];
        }
    }
}
