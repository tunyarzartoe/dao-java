package exercises;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力を受け取る
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int indexOfEven = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				// インデックスを保存してループを抜ける
				indexOfEven = i + 1;
				break;
			}
		}

		System.out.println(indexOfEven);
		sc.close();
	}

}
