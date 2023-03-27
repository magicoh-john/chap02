package sec07;

/**
 * 세 과목의 총점과 평균 구하기
 */
public class Array01Old {

	public static void main(String[] args) {
		int a = 80;
		int b = 75;
		int c = 90;
		
		int sum = 0;
		sum = a + b + c;
		// 정수간 나눗셈은 몫이 정수(소숫점 버림) 예방 차원에서 3 -> 3.0으로 double 변경
		double avg = sum / 3.0; 
		//double avg = (double)sum / 3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 총점
		System.out.println("총점 : " + sum);
		
		//Math.round()는 소숫점 1번째 자리에서 반올림한 정수를 반환함.
		//평균(81.66666666666667)
		System.out.println("1. 평균 : " + avg);
		System.out.printf("2. 평균 : %.2f \n", avg);
		System.out.printf("3. 평균 : " + Math.round(avg * 100)/100.0);
		System.out.println();
		System.out.println(String.format("4. 평균 : %.2f", avg)); 
		
		/** [Math.round]
		81.66666666666667 * 100
		Math.round(8166.666666666667)
		8167 / 100.0
		81.67		
		*/

	}

}
