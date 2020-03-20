package b_operator;
import java.util.Scanner;
public class Exam {
	
	public static void main(String[] args) {
	
		System.out.println("학생의 점수를 입력하세요");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		if(score<90 && score>80) {
			System.out.println(score +"은평균");			
		}
		else {
			System.out.println("");
		}	
	}
}

