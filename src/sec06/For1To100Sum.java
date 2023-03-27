package sec06;

/**
 * 1부터 100까지 합구하기
 *
 */
public class For1To100Sum {
	
	public static void main(String[] args) {
		int sum = 0;
		int i;
			
		for(i=1; i<=100; i++) {
			sum += i;
		}
			
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
 }