package ss13.exercise.bai2;

public class BinarySearch {
    static int[] list = {1, 2, 3, 4, 5, 6, 7, 8,9, 10, 11, 12, 13};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 5));  /* 4 */
        System.out.println(binarySearch(list, 7)); /* 6 */
        System.out.println(binarySearch(list, 9)); /*8 */
        System.out.println(binarySearch(list, 2));  /*1 */
        System.out.println(binarySearch(list, 6));  /*5 */
        System.out.println(binarySearch(list, 8)); /*7   */
    }
}
