package sec07;

/**
 * 다음은 서울의 월별 평균기온이다. 
 * 연평균 기온, 가장 높은 달의 온도, 가장 추운 달의 온도를 구하시오.
 * 서울의 온도 : -2.5, -0.2, 5.2, 12.1, 17.4, 21.9, 24.9, 25.4, 20.8, 14.4, 6.9, 0.2
 * 자료형은 float type 으로 정하시오.
 */
public class Array17SeoulTempSort {

	public static void main(String[] args) {

		float[] monTemp = new float[] { -2.5f, -0.2f, 5.2f, 12.1f, 17.4f, 21.9f, 24.9f, 29.4f, 27.8f, 14.4f, 6.9f,
				0.2f };

		float sum = 0.0f;
		double avg = 0.0;

		for (int i = 0; i < monTemp.length; i++) {
			sum = sum + monTemp[i];
			System.out.print(monTemp[i] + " ");
		}

		System.out.println();

		avg = sum / monTemp.length;

		float smallNum = 0.0f;

		// sorting
		for (int i = 0; i < monTemp.length - 1; i++) {
			for (int j = i + 1; j < monTemp.length; j++) {
				if (monTemp[i] < monTemp[j]) {
					smallNum = monTemp[i];
					monTemp[i] = monTemp[j];
					monTemp[j] = smallNum;
				}
			}
		}

		for (int i = 0; i < monTemp.length; i++) {
			System.out.println(monTemp[i]);
		}

		float maxTemp = monTemp[0]; // 맨좌측 최대값
		float minTemp = monTemp[monTemp.length - 1]; // 맨우측 최소값
		System.out.printf("서울의 연평균 기온은  %1$5.1f이며 가장 높은 기온은 %2$5.1f, " + "가장 낮은 기온은 %3$5.1f입니다.", avg, maxTemp,
				minTemp);
	}
}
