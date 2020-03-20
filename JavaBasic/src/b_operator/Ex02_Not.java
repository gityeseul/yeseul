package b_operator;

/**
 * 	not : 결과를 반대로 하는 연산자
 * 			- 일반논리 not :  ! true-> false false-> true
 * 			- 이진논리 not : ~ : 각 비트의 값이 0일 떄 1로 바구고 1일때 0으로 바꾼다.
 */
public class Ex02_Not {

	public static void main(String[] args) {
	
		boolean result = 3>4;
		System.out.println(result); //false
		System.out.println(!result); //true
		
		int a = 15;
		System.out.println(~a);
		int b = -8;
		System.out.println(~b);
		
	}

}
