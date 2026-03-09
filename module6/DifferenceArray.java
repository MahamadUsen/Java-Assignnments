public class DifferenceArray {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 0, 0, 0, 0};

        int[] diff = new int[n];

        rangeUpdate(diff, 1, 3, 5);
        rangeUpdate(diff, 2, 4, 2);

        arr[0] = diff[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        // Print final array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rangeUpdate(int[] diff, int L, int R, int val) {
        diff[L] += val;

        if (R + 1 < diff.length) {
            diff[R + 1] -= val;
        }
    }
}
