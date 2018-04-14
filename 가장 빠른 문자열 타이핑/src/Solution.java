import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String A = sc.next();
			String B = sc.next();

			String C = A.replaceAll(B, "!");

			System.out.println("#" + test_case + " " + C.length());
		}
	}

}
