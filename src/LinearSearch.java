import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 入力を受け取る
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int indexOfK = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                // インデックスを保存してループを抜ける
                indexOfK = i + 1;
                break;
            }
        }

        System.out.println(indexOfK);
        sc.close();
	}

}
