package temp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_토큰{

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		String number = input.nextLine(); //다음 문장(사용자가 콘솔에 작성한 문장)을 input에 넣어줘라
		StringTokenizer st = new StringTokenizer(number," "); //number를 토큰으로 나눈다	
		int i=0;
		int j=0;
		
		while(st.hasMoreTokens()) { //토큰이  몇개인지 모를때는 while 문을 쓴다
			//다음 토큰이 있는지 없는지 확인 = st.hasMoreTokens()
			String temp = st.nextToken();//다음 토큰을 가지고 와서 temp에 집어넣는다
			int su = Integer.parseInt(temp);// String을 int로 형변환 시키는 것
		
			if(su%2==0) {
				i++;
			}
			else {
				j++;
			}
		}
		System.out.println("짝수 :"+i+"개");
		System.out.println("홀수 :"+j+"개");
	}
	}

