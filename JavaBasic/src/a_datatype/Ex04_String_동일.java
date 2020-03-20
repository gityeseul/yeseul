package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String_동일 {

	public static void main(String[] args) {
			
		String a =new String("홍길동");
		String b =new String("홍길동");

		if(a==b) {
			System.out.println("동일");
		}
		else {
			System.out.println("다르다");
		}
		
		
		if(a.equals(b)) {
			System.out.println("동일");
		}
		else {
			System.out.println("다르다");
		}
			
		
	}

}
