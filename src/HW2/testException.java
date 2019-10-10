package HW2;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class testException {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        try {
            doException(a, b);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static void doException(int a, int b) throws MyArrayDataException {

        String[][] array = new String[a][b];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        if (a != 4 || b != 4) {
            throw new MyArraySizeException();
        }
        array[0][0] = "6";
        array[0][1] = "6";
        array[0][2] = "b";
        array[0][3] = "3";

        array[1][0] = "2";
        array[1][1] = "9";
        array[1][2] = "2";
        array[1][3] = "9";

        array[2][0] = "9";
        array[2][1] = "9";
        array[2][2] = "5";
        array[2][3] = "1";

        array[3][0] = "9";
        array[3][1] = "6";
        array[3][2] = "9";
        array[3][3] = "9";


        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++) {
                int i1 = 0;
                try {
                    i1 = parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                list.add(i1);
            }

        for (int i : list) {
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел массива равна " + sum);

    }
}
