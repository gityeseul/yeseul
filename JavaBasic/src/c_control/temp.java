package c_control;

import java.util.Scanner;

public class temp {
	public static void main(String[] args) {
		/*
		System.out.println("1과 100 사이의 숫자 3개를 입력하세요 ");
		Scanner input = new Scanner(System.in);
		int n1= input.nextInt();		
		int n2= input.nextInt();	
		int n3= input.nextInt();

		System.out.println(n1+" "+n2+" "+n3+" ");

		int max =0;

		if(n1>=n2) {
			if (n2>=n3) {max=n2;}
			else if(n3>=n1) {max=n1;}}

		else if(n1>=n3) 
			{if(n3>=n2) {max=n3;}
			 else if(n2>=n1) max=n1;}

		else if(n2>=n3 & n3>=n1) {max=n3;}
		else {max=n2;}

		System.out.println("2번째로 큰 수는");
		 */	

		int i =1, j=0;
		switch ( i ) {
		case 2 : j += 6; break;
		case 4 : j += 1; break;
		default : j += 2; 
		case 0 : j += 4; break; // default값이 수행되고(조건에 해당하는 case로 jump). 그 밑의 문장들이 모두 수행된다.
		}
		System.out.println( j ); 
	}}


