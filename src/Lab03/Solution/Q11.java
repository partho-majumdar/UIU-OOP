package Lab03.Solution;

public class Q11 {
    public static void main(String[] args) {
        String str = "Welcome to JAVA Programming";
        String[] strArr = str.split(" ");

        int max = 0;
        String ans = " ";

        for (int i = 0; i < strArr.length; i++) {
            String individualWord = strArr[i];

            int len = strLength(individualWord);

            if (len > max) {
                ans = individualWord;
            }
        }

        System.out.println(ans);
    }

    static int strLength(String str) {

        char[] arr = str.toCharArray();
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            length++;
        }

        return length;
    }
}
