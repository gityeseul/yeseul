package temp;

import java.util.Scanner;

public class Ex07_반복문연습 {
	public static void main(String[] args) {	

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int n2=0;

		for(int i=1; i<=n;i++) {
			n2=i-n;
				for(int j=1; j<=n; j++) {					
					n2+=n;
					System.out.print(" "+n2);
					}
			System.out.println();
		}
	}}