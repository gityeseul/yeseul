package c_control;

import java.util.Scanner;

public class temp3 {

	public static void main(String[] args) {

		System.out.println("자연수 n을 입력하세요");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int j = 0;
		int i=0;
		int n2=1;
		
		for(i=0; i<n; i++) {

			for(j=0; j<i; j++) {
				System.out.print(" ");	
			}
			for(j=1+i; j<=n; j++) {	
				System.out.print(n2);
				n2++;				
			}
			System.out.println();

		}
		
		
	}}

