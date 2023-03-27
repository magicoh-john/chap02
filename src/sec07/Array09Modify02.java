package sec07;

/**
 * 10칸짜리 int 배열을 만들고 그 안에 1부터 10까지 넣으시오.
 * 넣은 값들의 합계를 구하세요.
 *
 */
public class Array09Modify02 {

	public static void main(String[] args) {
		int[] array = new int[10]; // 10칸짜리 int[] 배열 선언
		
		// 배열 요소에 값 입력
		for (int i = 0; i < array.length; i++) { // 1…10까지 숫자 저장
			array[i] = i + 1;
		}
		
		// 값 출력
		int sum = 0;
		for (int i = 0; i < array.length; i++) { // 1… 10까지 출력
			sum += array[i];
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("1~10 합계 : " + sum);
	}
}
