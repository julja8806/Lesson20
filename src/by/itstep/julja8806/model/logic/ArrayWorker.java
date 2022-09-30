package by.itstep.julja8806.model.logic;

public class ArrayWorker {
    public static boolean checkValue(int[] array, int value) {
        int count = 0;
        for (int item : array
        ) {
            count++;
            if (item == value) {
                System.out.println("count = " + count);
                return true;
            }

        }
        System.out.println("count = " + count);
        return false;

    }

    public static int findFirstIndexValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;

            }

        }
        return -1;


    }

    public static int findLastIndexValue(int[] array, int value) {
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] == value) {
                return i;

            }

        }
        return -1;
    }

    public static int countValue(int[] array, int value) {
        int count = 0;
        for (int element : array
        ) {
            if (element == value) {
                count++;
            }

        }
        return count;
    }

    public static boolean binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        int count = 0;

        while (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (value == array[mid]) {
                System.out.println("count = " + count);
                return true;
            } else if (value > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("count = " + count);
        return false;

    }

}