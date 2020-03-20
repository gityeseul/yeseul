package c_control;
public class Ex04_for_중첩 {

	public static void main(String[] args) {


		/*for(int j=0;j<6;j++) {// 다섯줄 반복문		
			for(int i=0; i<j; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<5-j; i++) {
				System.out.print("*");//다섯개 만복문
			}	
			System.out.println();
		}


		//============================================================

		//A부터 Z까지 출력


		for(int i=0; i<26; i++) {
		for(char ch='A';ch<= 'A' + i  ; ch++) {
			System.out.print(ch+"");
		}
		System.out.println();
		}

//문제 2
		for(int i=0; i<26; i++) { // i가 1씩 증가 하면서 i=25일때 멈춘다.
	         for(char ch='Z';ch>= 'A'+i; ch--) {
	            System.out.print(ch); //A부터 Z-i(1씩증가) 출력 반복
	            String line = ch;
	            int l_line = ch.length();
	            for(int m = l_line-1; m>=0; m--) {
	    			System.out.print(line.charAt(m));
	    		}
	         }

	         }
//문제3		
		for(int i=0; i<26; i++) {
			for(char ch=(char)('A'+i); ch<='Z'; ch++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
//문제4
		for(int i=0; i<26; i++) {
			for(char ch='Z'; ch>='Z'-i; ch--)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
//문제5
		for(int j=0; j<26; j++) {
			for(int i=0; i<j; i++) {
				System.out.print(" ");
			}
			for(char ch=(char)('A'+j); ch<='Z'; ch++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		
		}}