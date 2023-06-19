package Lab03.Solution;

public class Q16 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 3 };
        int len = arr.length;

        System.out.println(len);

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < len - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    len--;
                    j--;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
    }
}
