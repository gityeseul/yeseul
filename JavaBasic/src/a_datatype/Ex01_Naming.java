package a_datatype;

/* 여러줄 주석 */
// 주석
/** 주석 */ /**도움말 만드는 주석*/

public class Ex01_Naming {
	/**
	 *		자료형 
	 *		1- 기본형
	 *				논리형 : boolean
	 *				문자형: char(2B)
	 *				정수형: int(4B) / long(8B)
	 *				실수형: double(8B)
	 * 		2- 참조형
	 * 				배열 / 클래스
	 */
	public static void main(String[] args) {

		// 1. 변수선언 : 메모리에 영역 확보하기
		// (1) 문자형 변수  ch 선언하기
		char ch = 97;
		System.out.println("ch 값: " + ch);
		char ch_, ch2;
		// (2) 정수형 변수 abcdefz 선언하기
		long abcdefz;		
		// (3) 실수형 변수 Ch 선언하기
		double Ch;
		// 2. 변수에 값 대입하기
		int su = 'B';
		System.out.println("su의 값 : " + su);

		abcdefz = 1000000000L; // java는 숫자를 기본적으로 int로 처리해서 20억 이상의 수는 뒤에 L을 써준다.
		Ch = 3.6;

		// 3. 논리형 변수 b 선언하고 true 값 대입하기(지정하기)
		boolean b = true;

	}

}
