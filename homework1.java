public class homework1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2024));

        int[] repeatArray = createArray(3,6);
        PrintArray(repeatArray, "");

        int[] array0_1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        inverseArray(array0_1);
        PrintArray(array0_1,"");

        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        DoublingLessNumber(numbers, 6);
        PrintArray(numbers," ");

        int [][] twoDimArray = {{5,7,3,17}, {7,0,4,12}, {8,5,2,3}, {5,3,2,11}};
        UnitsDiagonalli(twoDimArray);
        for (int i = 0; i < twoDimArray.length; i++) {
            PrintArray(twoDimArray[i]," ");
        }
    }

    private static void PrintArray(int[] array, String sep) {
        for (int item : array) {
            System.out.print(Integer.toString(item) + sep);
        }
        System.out.println('\n');
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        return (a + b > 20) || (a + b < 10) ? false : true;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x > 0 ? true : false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println('\n');
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ? true : false;
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        if (isPositive(len)) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
        }
        return null;
    }


/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
    private static void inverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(--array[i]);
        }
    }

 /** 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
    private static void DoublingLessNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) array[i] *= 2;
        }
    }

 /** 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
    private static void UnitsDiagonalli(int[][] array) {
        int length = array.length;
        boolean quadrat = true;
        for (int i = 0; i < length; i++) {
            if (array[i].length != length) {
                quadrat = false;
                break;
            }
        }
        if (quadrat) {
            for (int i = 0; i < length; i++) {
                array[i][i] = 1;
                array[i][length - i - 1] = 1;
            }
        }
    }
}