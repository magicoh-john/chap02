package sec07;

/**
 * 배열의 사이즈 : length() 메소드로 구함
 */
public class Array05Length {
	
	public static void main(String[] args) {
		//배열 변수 선언과 배열 대입
		int[] scores = { 84, 78, 91 };

		//배열 항목의 총합 구하기
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

		//배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.printf("평균 : %.2f", avg);
	}
}