package b_operator;

import java.util.Scanner;

public class Ex09_Samhang2 {

	public static void main(String[] args) {
		//학생점수를 입력 받으세요
		//80점 이상이면 합격 아니면 불합격

		
		System.out.println("학생점수를 입력하세요");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//(1)
		String a = "합격";
		String b = "불합격";
		System.out.println( (n>80)? a:b ); 
		
		//(2)
		String result = (n >= 80)? "합격" : "불합격";
		System.out.println("결과:"+result); 
		
	}

}
