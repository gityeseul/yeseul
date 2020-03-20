package temp;

public class Ex05_while_연습 {

	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			int su = i;
			boolean su369 = false; //if문 안에 값이 들어 있는지 아닌지 확인할 때 사용

			while(su!=0) {
				int na = su%10;
				if(na==3||na==6||na==9) {
					System.out.print("짝!");
					su369 = true;
				}
				su/=10;//
			}//su369값을 출력
			if(su369) {
				System.out.print("");
			}	
			else System.out.print(i);
		}
	
}}