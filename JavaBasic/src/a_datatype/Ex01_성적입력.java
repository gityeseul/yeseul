package a_datatype;

import java.util.*;
import java.util.StringTokenizer;

public class Ex01_성적입력 {
	//입력형식 98/88/77
	//출력형식
	//총점 : 15535
	//평균 : 46

	public static void main(String[] args) {

		int [] score = new int[3];
		int number=0;
		int total=0;

		System.out.println("3의 성적을 A/B/C 형식으로 입력하세요");
		Scanner input = new Scanner(System.in);	
		String st =input.nextLine();
		StringTokenizer sc = new StringTokenizer(st,"/");
		double avg=0;

		for(int i=0; sc.hasMoreTokens(); i++) { //토큰이  몇개인지 모를때는 while 문을 쓴다
			//다음 토큰이 있는지 없는지 확인 = st.hasMoreTokens()
			String temp = sc.nextToken();//다음 토큰을 가지고 와서 temp에 집어넣는다
			number = Integer.parseInt(temp);// String을 int로 형변환 시키는 것

			score[i] = number;
			total += number;
			avg=(double)total/i;
		}

		System.out.println("총점은 : "+total);
		System.out.printf("평균은 : %f",avg);

	}
}
