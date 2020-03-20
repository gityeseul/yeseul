package b_operator.copy;
import java.util.Scanner;
/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기
public class Ex03_Arithmetic {
	public static void main(String[] args) { 
/*		int n1, n2;
		
		Scanner input = new Scanner(System.in); 
		System.out.print("정수1 입력->");
		n1 = input.nextInt();
		System.out.print("정수2 입력->");
		n2 = input.nextInt();
		
		int p = n1 + n2;
		int man = n1 - n2;
		int mup = n1*n2;
		double div = (double) n1/n2;
		
		System.out.println("더하기:"+ p+ "  빼기:"+ man +"  곱하기:"+ mup + "  나누기:"+ div);
		System.out.printf("더하기 : %d, 빼기 : %d, 곱하기 : %d, 나누기 : %f", p, man, mup, div);
*/
		
		//나머지 연산자 활용 - 홀 짝 구하기
		
		int su = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		su = input.nextInt();
		
		if(su%2 == 0) 
			{System.out.println("짝수");}
		else 
			{System.out.println("홀수");}
		
		if(su==0)
		{System.out.println("0은 3의 배수가 아닙니다.");}
		else if(su%3 == 0)
		{System.out.println("3의 배수");}
		else 
		{System.out.println("3의배수 아님");}
			
}		
}