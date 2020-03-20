
package c_control;

import java.util.Scanner;

public class temp2 {

	public static void main(String[] args) {
		
		System.out.println("자연수 n을 입력하세요");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=n; j-i>0; j--) {
				System.out.print(" ");	
			}
			for(int j=0; j<=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}

	}}
