package sec07;

/**
 * NullPointerException
 *  - 메모리에 공간이 안만들어진 상태에서 특정 요소의 값에 접근할 경우 발생
 *
 */
public class Array00NullPointerException {
	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[3];
		intArray[0] = 10; //NullPointerException[윗줄 없으면]
		System.out.println(intArray[0]);
		
		String str = null;
		str = "안녕하세요.";
		System.out.println("총 문자 수: " + str.length() );//NullPointerException[윗줄 없으면]
		
		String str2 = new String("안녕하세요.");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		
		String str3 = "";
		boolean flag = true;
		if(flag) {
			str3 = "안녕";
		}else {
			str3 = "안녕못해";
		}
		System.out.println(str3);
		
	}
}