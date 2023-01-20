public class ArrayQ1 {

    public static int divBySum(int[] arr, int num){
        int sum = 0;
        for (int i : arr) {
            if (arr[i] % num == 0){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(divBySum(ints, 3));
    }
}
