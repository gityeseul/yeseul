package c_control;

import java.util.Scanner;

public class temp13 {

	public static void main(String[] args) {
		
	//for문 문제2)
	/*	
		System.out.println("문자를 하나 입력하세요");
		Scanner input = new Scanner(System.in);
		char n = input.next().charAt(0);

		if('A'<= n && 'Z'>= n) {
			for(char i= n; i<='Z'; i++) {
				System.out.print(i);
			}}		
		else if	('a'<= n && 'z'>= n) {
			for(char i = 'a';i<=n ; i++) {
				System.out.print(i);
			}}		else {
				System.out.println("문자를 다시 입력하세요");
			}
	*/
	//for문 문제3)
	/*
		System.out.println("문장을 입력하세요");
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		
		System.out.println(n);
		
		int s= n.length();
		System.out.println(s);
		int i=0;
		
		for(i=s;i>0;i-- ) {
		System.out.print(n.charAt(i-1)); //charAt() : 괄호 안의 n번째 문자를 추출
		}
	*/	
	//문제1
	/*	
		
		for(int j=0; j<26; j++) {
			
			for(char i='A';i<='A'+j ;i++) {
				System.out.print(i);
			}
			System.out.println();}
	*/
		
	//문제2
	/*	for(int i=0; i<26; i++) { // i가 1씩 증가 하면서 i=25일때 멈춘다.
			for(char ch='A';ch<= 'Z' - i ; ch++) {
			System.out.print(ch); //A부터 Z-i(1씩증가) 출력 반복
			}
			System.out.println();
			} 

*/
	//문제3
	/*	
		for(int i=0; i<26;i++) {
			for(char ch= (char)('A'+i); ch<='Z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	*/	

	//문제4
	/*	for(int i=00; i<26; i++) {
			for(char ch= 'Z'; ch >= 'Z'-i;ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
	//문제5
	/*
		for(int i = 0; i<26; i++) {
			for(int j= 0;j<i ;j++) {
				System.out.print(" ");
			}
			for(char ch=(char)('A'+i); ch<='Z';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	*/
	//for문 과제1
	/*
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	


	for(int i=0; i<=n; i++) {
		for(int j=n; j>=i; j--) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}	
		*/
		
	//for문 과제2	
	/*	Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int n2=0;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--){				
				n2++;
				System.out.print(n2);
			}
			System.out.println();
		}
		*/
	//for문 과제3
	/*
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		int n2 = input2.nextInt();
		int n3=0;
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n2; j++) {
				n3++;
				System.out.print(n3);
			}
			System.out.println();
		}
		*/
		
		//도전문제
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int n2=1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				System.out.print(n2+" ");
				n2+=2;
				if(n2>=10) {
					n2=n2%10;
				}
			}
			System.out.println();
		}
	}}
