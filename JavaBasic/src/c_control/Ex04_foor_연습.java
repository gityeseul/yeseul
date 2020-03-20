package c_control;

import java.util.Scanner;

public class Ex04_foor_연습 {
	public static void main(String[] args) {

/*		int result = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("문자를 입력하세요");
		char n = input.next().charAt(0);
//(2)
		if('a'<=n && 'z'>=n) {
			for(char n1='a'; n1<=n; n1++) {
				System.out.print(n1);}
			}
		
		else  if('A'<=n && 'Z'>=n) {
			for(char n2 = 'A'; n2<=n; n2++) {
			System.out.print(n2);}
			}
		else {
			System.out.println("문자를 다시 입력하세요");
		}
*/		
//(3)
		
		//char N = sc.nextKLine().charAt(0); -->결과 알아보기
		
	/*	System.out.println("문장"+ "를 입력하세요");
		Scanner input = new Scanner (System.in);
		String s = input.nextLine();
		
		System.out.println(s);
		int l=s.length();
		System.out.println(l);
		int i;
		
		for(i=1;i<=s.length();i++) {
			System.out.print(s.charAt(s.length()-i));
		}
	*/
		System.out.println("문장"+ "를 입력하세요");
		Scanner input2 = new Scanner (System.in); 
		String line = input2.nextLine(); 
		
		int l_line = line.length();
		
		for(int i = l_line-1; i>=0; i--) {
			System.out.print(line.charAt(i));
		}
		
	}}       