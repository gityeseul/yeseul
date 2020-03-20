//3월 13일 연습

package b_operator.copy;
import java.util.Scanner;

public class temp {
	public static void main(String[] args) {

		
		//import java.util.Scanner; 단축기 : ctrl shift o
		//not연산자
		System.out.println("1.not연산자");
		boolean n1 = 3>9;
		System.out.printf("3>9가 %s \n", n1);

		//~은 2진수의 0을 1로 1을 0으로 바꾼다
		System.out.println("2.2진수의 0을 1로 1을 0으로 바꾼다");
		Scanner input = new Scanner(System.in);
		int n2 = input.nextInt();
		System.out.println(~n2);

		//홀짝구하기

		Scanner input2 = new Scanner(System.in);
		System.out.println("3.정수를 입력하세요 짝수 홀수를 알려줍니다.");
		int n3 = input2.nextInt();

		if(n3%2 == 1) {
			System.out.println(n3+ "<-- 홀수입니다.");
		}
		else {System.out.println(n3+ "<-- 짝수입니다.");}

		//90이상은 A 80이상은B 50이상은C 이하는F
		System.out.println("4.학생의 학점은?");
		Scanner input3 = new Scanner(System.in);
		System.out.println("학생의 점수를 입력하세요");
		double n4 = input3.nextDouble();

		if (n4>90) {
			System.out.println("성적은 'A'");}
		else if (n4>80) {
			System.out.println("성적은 'B'");}
		else if (n4>50) {
			System.out.println("성적은 'C'");}
		else {System.out.println("성적은 'F'");}

		//윤년, 평년 

		Scanner input4 = new Scanner(System.in);
		System.out.println("5.연도를 입력하세요 평년인지 윤년인지 알려드립니다.");
		int n5 = input.nextInt();

		if (n5%400==0) {
			System.out.printf("%d는 윤년입니다.\n", n5);}
		else if (n5%100==0) {
			System.out.printf("%d는 평년입니다.\n", n5);}
		else if (n5%4==0) {
			System.out.printf("%d는 윤년입니다.\n", n5);
		}
		else {System.out.printf("%d는 평년입니다.\n", n5);}

		//equals

		System.out.println("문장을 입력하세요");
		Scanner input5 = new Scanner(System.in);
		String w1 = input5.nextLine();
		input.nextLine();
		System.out.println("문장을 하나 더 입력하세요");
		Scanner input6 = new Scanner(System.in);
		String w2 = input6.nextLine();
		input.nextLine();	

		if(w1.equals(w2)) {
			System.out.println("두 문장은 같습니다.");}
		else {System.out.println("두 문장은 다릅니다.");}

		System.out.println("단어를 입력하세요");
		Scanner input7 = new Scanner(System.in);
		String w3 = input7.nextLine();

		System.out.println("단어을 하나 더 입력하세요");
		Scanner input8 = new Scanner(System.in);
		String w4 = input.nextLine();

		if(w3.contentEquals(w4)) {
			System.out.println(w3+" 와 "+w4+" 의 단어는"
					+ " 같습니다.");
		}
		else {System.out.println(w3+"와"+w4
				+"의 문장은 다릅니다.");}

	}
}

