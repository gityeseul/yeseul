package b_operator.copy;
/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {
	public static void main(String[] args) {
		
		/*int a = 5;
		int b = 7;
		
		// [1]
		System.out.println("a="+a +", b"+b);
		System.out.println("a="+a+1 +", b"+b+1); //a=51,b71
		System.out.println("a="+(a+1) +", b"+(b+1)); //a=6,b8
		System.out.println("a="+a +", b"+b);
				
		// [2]
		a++; //a=a+1;
		b--; //b=b-1;
		System.out.println("a="+a+", b="+b);

	
		//(3) 증가 감소 연산자는 위치가 중요
		
		int a =5;
		int b= 7;
		
		int result = ++a; //6 이유: 더하고 대입한다.
		System.out.println(",결과"+ result);
		int result2 = b--;//8 ->>정답 : 7 이유: 대입하고 빼준다.
		System.out.println(",결과"+ result2);
		System.out.println("b: "+ b);
		*/
		//(4)
		

		int a =-5;
		int b= 7;
		
		System.out.println("a"+ ++a + ",b"+ --b); //6 6
		System.out.println("a"+ a++ + ",b"+ b--); //6 6 : 뒤에 붙은 연산자는 밑줄의 연산까지 된다.
		System.out.println("a"+ a + ",b"+ b); // 7 5
		System.out.println("a"+ ++a + ",b"+ --b); // 8 4
		System.out.println("a"+ a++ + ",b"+ b--); // 8 4
		System.out.println("a"+ a++ + ",b"+ b--); // 9 3
	}
}
