package c_control;

import java.util.*;

public class Ex02_if_학번 {

	public static void main(String[] args) {


		System.out.println("학번을 입력하세요");
		Scanner input = new Scanner(System.in);
		String id = input.next();
		System.out.println("학번은 :"+id);


		String n1 =  id.substring(5,7);

		String n2 =  id.substring(4);
		int dg = Integer.parseInt(n2);

		String n3 =  id.substring(0,4);
		int year = Integer.parseInt(n3);

		String a1 = "공대";
		String a2 = "사회대";

		String b11 = "컴퓨터학과";
		String b12 = "소프트웨어학과";
		String b13= "모바일학과";
		String b22 = "자바학과";
		String b33 = "서버학과";

		String c11 = "사회학과";
		String c12 = "경영학과";
		String c13= "경제학과";

		/*
		if(dg == 1) {
			if(n1.equals("11")) {
				System.out.println(id+"는"+year+"년도에 입학한 "+a1 + b11 +"학생입니다.");
			}
			else if(n1.equals("12")) {
				System.out.println(id+"는"+year+"년도에 입학한"+a1 + b12 +"학생입니다.");
			}
			else if(n1.equals("13")) {
				System.out.println(id+"는"+year+"년도에 입학한 "+a1+ b13 +"학생입니다.");
			}
			else if(n1.equals("22")) {
				System.out.println(id+"는"+year+"년도에 입학한"+a1+ b22 +"학생입니다.");
			}
			else if(n1.equals("33")) {
				System.out.println(id+"는"+year+"년도에 입학한 "+a1 + b33 +"학생입니다.");
			}}

		else if(dg == 2) {
			if(n1.equals("11")) {
				System.out.println(id+"는"+year+"년도에 입학한 "+a2 + c11 +"학생입니다.");
			}
			else if(n1.equals("12")) {
				System.out.println(id+"는"+year+"년도에 입학한 "+a2 + c12 +"학생입니다.");
			}
			else if(n1.equals("13")) {
				System.out.println(id+"는"+year+"년도에 입학한 "+a2 + c13 +"학생입니다.");
			}}
		 */

		if(dg == 1) {
			switch(n1) {	
			case "11" : System.out.println(id+"는"+year+"년도에 입학한 "+a1 + b11 +"학생입니다.");  break;
			case "12" : System.out.println(id+"는"+year+"년도에 입학한"+a1 + b12 +"학생입니다."); break;
			case "13" : System.out.println(id+"는"+year+"년도에 입학한 "+a1+ b13 +"학생입니다."); break;
			case "22" : System.out.println(id+"는"+year+"년도에 입학한"+a1+ b22 +"학생입니다."); break;
			case "33" : System.out.println(id+"는"+year+"년도에 입학한 "+a1 + b33 +"학생입니다."); break;
			}
		}
		else if(dg == 2) {
				switch(n1) 
				{
				case "11" : System.out.println(id+"는"+year+"년도에 입학한 "+a2 + c11 +"학생입니다.");break;
				case "12" : System.out.println(id+"는"+year+"년도에 입학한 "+a2 + c11 +"학생입니다.");break;
				case "13" : System.out.println(id+"는"+year+"년도에 입학한 "+a2 + c11 +"학생입니다.");break;
				}
			}
		
	}}
