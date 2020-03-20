package c_control;
import java.util.*; // *은 모든 것
public class Ex01_if_주민번호 {
	public static void main(String[] args) {


		String id = "200305-3222222";
		char sung = id.charAt(7);
		// sung 변수의 값이 1이면 남자 아니면 여자 출력

		if(sung == '1' || sung == '3'|| sung == '9') {
			System.out.println("성별은 : 남자");
		}
		else if(sung == '2' || sung == '4' || sung == '0'){
			System.out.println("성별은 : 여자");
		}

		String nai =  id.substring(0,2);
//올해 년도 구하기
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		if (sung == '1' ||sung == '2' )
		{
			//나이
			//문자열 전수로 변환
			int nai2 = Integer.parseInt(nai);
			int age;
			
			age = year - (1900 + nai2) +1;
			System.out.println("나이는 : "+age);}

		else if (sung == '3' || sung == '4'){

			int nai3 = Integer.parseInt(nai);
			int age2 = 0;
			
			age2 = year - (2000 + nai3) +1;
			System.out.println("나이는 : "+age2);
		}
		else if (sung == '0' || sung == '9'){

			int nai3 = Integer.parseInt(nai);
			int age2 = 0;
			
			age2 = year - (1800 + nai3) +1;
			System.out.println("나이는 : "+age2);
		}
	}}
//이따 String id 받아서 해보기