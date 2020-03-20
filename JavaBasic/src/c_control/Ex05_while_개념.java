package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while_개념 {

	public static void main(String[] args) {
		//1부터 10까지 합
		/*int j=0;
		int i=1;
		//for(; i<=10;) {
		//	j+=i;	
		//	i++;
		// } //밑에 while문이랑 for문이랑 같다.
		while(i<=10) {
			j+=i;	
			i++;
		}
		System.out.println(j);
		*/
		
		//숫자 하나 입력 -> 구구단
		/*
		Scanner input = new Scanner(System.in);
		int i =input.nextInt();
		
		for(int j=1;j<=9;j++) {
			System.out.printf("%d X %d = %d\n", i, j, i*j);
		}
		int j=1;
		while(j<=9) {
			System.out.printf("%d X %d = %d\n", i, j, i*j);
			j++;
		}
		//몇번 돌려야 하는 지 돌릴때 
		 * */
		
		//문장을 입력받아 단어로 나눠서 출력
		//"빨리 코로나 끝났으면 좋겠다"
		/*
		System.out.println("문자열을 입력해 주세요");
		Scanner input = new Scanner(System.in);
		String line  =input.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		while(st.hasMoreTokens()) { //토큰이  몇개인지 모를때는 while 문을 쓴다
			String temp = st.nextToken();
			System.out.println(temp);
		}
		*/
		System.out.println("점수를 입력해 주세요 ex) 90/80/70/60");
		Scanner input = new Scanner(System.in);
		String line  =input.nextLine();
		StringTokenizer st = new StringTokenizer(line,"/");
		while(st.hasMoreTokens()) { //토큰이  몇개인지 모를때는 while 문을 쓴다
			String temp = st.nextToken();
			int su = Integer.parseInt(temp);// String을 int로 형변환 시키는 것
			
			
			System.out.println(++su);
		}
	}}
