package b_useful_class;

public class StringStringBuffer {

	public static void main(String[] args) {
		// 0.기본형
		int a = 10;
		a += 5;
		System.out.println(a);
		
		//1. String : 참조형 <-String은 class
		String s = new String("안녕");
		//String s = "안녕";
		s = s + "하세요";
		System.out.println(s); //string을 많이 쓰니깐 String은 이게 가능하게 한다.
		
		//2.StringBuffer
		StringBuffer sb = new StringBuffer("행복한");//문자열이 계속 변하면 이거 써야한다. 효율의 이유
		//StringBuffer sb2 ="행복한"; <- 에러난다 : 이렇게 쓰는건 String만
		//sb+= "목요일";<- 에러난다 : 이렇게 쓰는건 String만
		
		sb.append("목요일");
		System.out.println(sb);
	}

}
