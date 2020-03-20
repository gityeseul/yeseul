package b_operator.copy;

import java.util.Scanner;

public class year {
public static void main(String[] args) {
   
   
	
   Scanner input = new Scanner(System.in);
   System.out.println("연도를 입력하세요");
   int year = input.nextInt();
   
   if(year%400==0) 
   {System.out.println("윤년입니다.");}
   else if( year%100==0){
         System.out.println("윤년아닙니다.");}
   else if( year%4==0){
      System.out.println("윤년입니다.");}
   else {System.out.println("윤년이 아닙니다.");}
  
   
   }
}