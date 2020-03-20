package temp;

import java.util.Scanner;

public class do_while_n입력멈춤 {

	public static void main(String[] args) {

		String result = "";
	do {
		 //반복문이 계속 true
			System.out.println("숫자 입력");
			Scanner input = new Scanner(System.in);
			int su =input.nextInt();

			int i=1;
			while(i<=9) {
				System.out.printf("%d X %d = %d\n", su, i, i*su);
				i++;
			
			}
			System.out.println("다시 입력하겠습니까?");
			result =input.next();
			//if(result.equals("N")|| result.equals("n")) break;			
			//윗줄 하면 멈출대 사용
		}while(result.equals("Y")|| result.equals("y"));
		//계속 할 때 사용
	
	}}