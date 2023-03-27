package sec06;

import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String strNum1 = scanner.nextLine();
		System.out.println("숫자를 입력하세요.");
		String strNum2 = scanner.nextLine();
		
		int sum = 0;
		sum = Integer.parseInt(strNum1)+ Integer.parseInt(strNum2);
		System.out.println("sum : " + sum);
	}

}
