package temp;

import java.util.Scanner;

public class Ex07_반복문연습02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		int n2 = input2.nextInt();
		int n3=0;
		int n4=0;

		for(int i=1; i<=n;i++) {
			n3= n2*(i-1);
			n4= n2*i+1;
			if(i%2==1) {

				for(int j=1; j<=n2; j++) {
					n3++;
					System.out.print(" "+n3);
				}
			}
			else {
				for(int j=1; j<=n2; j++) {
					n4--;
					System.out.print(" "+n4);
				}
			}
			System.out.println();
		}
	}}