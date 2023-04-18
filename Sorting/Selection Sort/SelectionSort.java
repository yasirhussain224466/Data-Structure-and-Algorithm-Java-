public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = { -15, 7, 20, 1, -22, 35, 55 };
        for (int unsortedArray = intArray.length - 1; unsortedArray > 0; unsortedArray--) {
            int temp = 0;
            for (int i = 1; i < unsortedArray; i++) {
                if (compareLargestNumber(intArray, temp, i)) {
                    temp = i;
                }
            }
            swap(intArray, temp, unsortedArray);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int array[], int from, int to) {
        if (from == to) {
            return;
        }
        int temp;
        temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

    public static boolean compareLargestNumber(int array[], int first, int second) {
        if (array[first] < array[second]) {
            return true;
        }
        return false;
    }

}
