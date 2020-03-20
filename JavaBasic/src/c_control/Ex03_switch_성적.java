package c_control;
import java.util.Scanner;
public class Ex03_switch_성적 {


	public static void main(String[] args) {

		
		//0. 국영수 점수 입력 받아서 총점, 평균 출력
		//1. 평균에 따라서 학점 (A-F)출력 
		//if문장을 이용
		
		System.out.println("국어점수를 입력하세요 ");
		Scanner input = new Scanner(System.in);
		int kor= input.nextInt();
		
		System.out.println("영어점수를 입력하세요 ");
		Scanner input2 = new Scanner(System.in);
		int eng= input2.nextInt();
		
		System.out.println("수학점수를 입력하세요 ");
		Scanner input3 = new Scanner(System.in);
		int math= input3.nextInt();
		
		int total = kor + eng + math; 
		double avg = (double)total / 3.0;
		
		System.out.println("총점: " +  total ); 
		System.out.println("평균: " +  avg ); 	
		
		int avg2= (int)avg/10;
		
			switch(avg2) {	
			case 10 : System.out.println("학점은  'A"); break;
			case 9 :  System.out.println("학점은  'A"); break;
			case 8 :  System.out.println("학점은  'B"); break;
			case 7 :  System.out.println("학점은  'C"); break;
			case 6 :  System.out.println("학점은  'D"); break;
			case 5 :  System.out.println("학점은  'F"); break;
			default : System.out.println("F입니다. 재수강 하세요");
			}
		
	
		}
	}

