package sec07;

/**
 * 모듈화
 *  - 평균 구하는 로직을 메소드로 분리함
 */
public class Array03Param {

	public static void main(String[] args) {
		
		int[] intArr = {80, 75, 90};
		
		double avg = getSum(intArr);	// 배열을 전달함
		
		System.out.printf("avg : %.2f", avg);
	}

	// 평균을 구해주는 메소드(double : 반환 타입)
	public static double getSum(int[] arr) {	// 매개변수가 배열 타입
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println(arr[i]);
		}
		
		double avg = (double)sum / arr.length;
	
		return avg; // 값을 반환
	}
}
