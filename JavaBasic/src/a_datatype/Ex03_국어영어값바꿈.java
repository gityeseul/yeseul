package a_datatype;

public class Ex03_국어영어값바꿈 {
	public static void main(String[] args) {
		
		// 국어점수를 저장할 변수 선언 - 값 대입
//			int kor;
//			kor = 90;
//		// 초기화 : 변수 선언시 값 대입
//			int eng = 88;	
//		//  kor와 eng 두개 이상의 변수를 한 번에 선언
		int kor = 90, eng = 88;
		System.out.print("국어:" + kor + ", 영어:" + eng + "\n");
		// ---------------------------------------------------
		// 점수바꾸기 - swap
		System.out.printf("국어: %d, 영어 : %d \n", kor, eng);
		// kor과 eng의 값을 변환시킬때 = swap
	
		
		int temp;
		temp = kor;
		kor = eng;
		eng = temp;
		
		
		System.out.printf("국어: %d, 영어 : %d\n", kor, eng);
		if (kor == eng) {
			System.out.println("동일한 점수");
		} else {
			System.out.println("다른점수");
		}
		
		
	}
}
