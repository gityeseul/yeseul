package temp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_성적2 {

	public static void main(String[] args) {
		//학생수를 입력
		System.out.println("학생수 입력");
		Scanner input = new Scanner(System.in);
		int su = input.nextInt();
		input.nextLine();

		//점수를 저장할 학생수 만큼 선언
		int score[][]= new int[su][3];

		//한 학생당 과목이 3개
		int number=0;
		int sum=0;
		double evg=0;

		//입력
		System.out.println("'n/n/n'식으로 입력하세요");
		for(int n=0;n<su;n++) {
			System.out.println((n+1)+"번째 학생의 성적을 입력하세요");
			Scanner input2 = new Scanner(System.in);
			String st = input2.nextLine();
			StringTokenizer token= new StringTokenizer(st,"/");
			int tokensu=token.countTokens();//토큰 수 count
			for(int a =0; a <tokensu; a++) {//토큰 수 만큼 돈다
				//다음 토큰이 있는지 없는지 확인 = st.hasMoreTokens()
				String temp = token.nextToken();//다음 토큰을 가지고 와서 temp에 집어넣는다
				score[n][a] = Integer.parseInt(temp);// String을 int로 형변환 시키는 것
			}}

		//출력
		System.out.println("[결과]");
		for(int i=0; i<score.length; i++) {
			sum=0;
			for(int j=0; j<score[i].length; j++){
				sum += score[i][j];
			}
			evg =((double)sum/(score.length+1));//전체에 ()를
			System.out.print((i+1)+"째 학생의 총점은"+sum+"이고 평균은"+evg+"입니다.");
			System.out.println();
		}	

	}}
