package c_control;
public class Ex04_for_개념 {

	public static void main(String[] args) {
		//01. 안녕하세요 5번 출력하기
		/*for(int i=0; i<5; i++) {
			System.out.println("안녕하세요." + i);}*/

		/*int result = 0;
		for(int i = 1; i <101; i++) {
			//result = i+ result;	
			result += i;
		}
		System.out.println("합 : "+result);


		int even = 0;
		int odd = 0;

		for(int i = 1; i <101; i++) {
			//result = i+ result;	
			if (i%2 == 0) {
			even += i;}
			else {
			odd += i;}
		}
		System.out.println("짝수합 : "+even);
		System.out.println("짝수합 : "+odd);
		 */

		//03. A부터 Z까지 출력

		for(char ch='a';ch<='z' ; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println( );
		for(char ch='A';ch<='Z' ; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		//A부터 Z까지 출력(2개씩 건너서)
		for(char ch='a';ch<='z' ; ch+=2) {
			System.out.print(ch+" ");
		}
		System.out.println( );
		for(char ch='A';ch<='Z' ; ch+=2) {
			System.out.print(ch+" ");
		}
		System.out.println( );
		for(char ch='Z';ch>='A' ; ch--) {
			System.out.print(ch+" ");
		}
	}}
