package c_control;

import java.util.Scanner;

public class temp4 {

	public static void main(String[] args) {

		System.out.println("자연수 n을 입력하세요");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("자연수 n을 입력하세요");
		Scanner input2 = new Scanner(System.in);
		int m = input2.nextInt();

		int d=1;

		/*for(int i=0; i<n; i++) {

			for(int j=0; j<m; j++) {
				System.out.print(d);
				d++;
				}
			System.out.println();
		}

}}
		 */
		for(int i = 1; i<=n*m;i++) {
			System.out.print(i+" ");

			if(i%m == 0) {
				System.out.println();
			}}
	}}