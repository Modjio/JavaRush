public class MultiplicationTable {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];

        for (int x = 1; x <= MULTIPLICATION_TABLE.length; x++) {
            for (int y = 1; y <= MULTIPLICATION_TABLE.length; y++) {
                MULTIPLICATION_TABLE[x - 1][y - 1] = x * y;
            }
        }

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }

    }
}
