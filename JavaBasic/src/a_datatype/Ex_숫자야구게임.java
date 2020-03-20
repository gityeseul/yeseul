package a_datatype;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_숫자야구게임 {

	public static void main(String[] args) {
		int []baseball = new int[3];
		int []answer= new int[3];
		int strike=0;
		int ball=0;
		int i, j=0;
		
		//임의의 수 3개를 baseball에 저장
		//중복수 배제

		/*for(i=0; i<3; i++) {
			baseball[i]=(int)(Math.random()*10);}	
		for(i=0; i<3; i++) {
		for(int k=0; k<3; k++) {
		if(baseball[i]==baseball[k]&&k!=i) {
			baseball[i]=(int)(Math.random()*10);

		}}
		System.out.print(baseball[i]);
		}

		 */
		
		for(i=0; i<3; i++) {
			baseball[i]=(int)(Math.random()*10);
			for(j=0; j<i; j++) {
				while(baseball[i]==baseball[j]) {
					baseball[i]=(int)(Math.random()*10);
					
					
				}}
			
			System.out.print(baseball[i]);
		}	


		STOP:for(int ch=0; ch<6; ch++) {
			strike=0;
			//사용자 입력값을 받아서 answer에 각각 저장
			System.out.println("숫자입력하세요: a/b/c 형식으로");
			Scanner input= new Scanner(System.in);
			String number = input.nextLine();
			StringTokenizer st = new StringTokenizer(number,"/");

			for(int a =0; st.hasMoreTokens(); a++) {
				//토큰이  몇개인지 모를때는 while 문을 쓴다
				//다음 토큰이 있는지 없는지 확인 = st.hasMoreTokens()
				String temp = st.nextToken();//다음 토큰을 가지고 와서 temp에 집어넣는다
				int me = Integer.parseInt(temp);// String을 int로 형변환 시키는 것
				answer[a]= me;//고치

			}
			//값비교
			for(int a=0; a<=baseball.length;a++) {
				for(int w=0; w<3; w++) {
					if(baseball[a] == answer[w]) {
						if(a==w) {
							strike++;
						}
						else ball++;
					}
				}
			}
			System.out.println("s:"+strike+"b:"+ball);

			if(strike==3)break STOP;
		}
		if(strike==3) {System.out.println("WIN!");}
		else {System.out.print("FAIL");
		System.out.print("처음부터 다시 도전하세요");}
	}}