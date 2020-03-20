package temp;

public class Ex07_continue_break {

	public static void main(String[] args) {
		/*
		int n=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(j==1) break; //반복 벗어나기
				System.out.printf("< %d , %d >\n", i, j); // 총 실행 횟수 : 6
			}
			System.out.println("data");
		}
		*/
		//< 0 , 0 >
		//data
		//< 1 , 0 >
		//data
		//< 2 , 0 >
		//data
		//here붙은 for문
		HERE:for(int i=0; i<2; i++) {
				for(int j=0; j<4; j++) {
				//if(j==1) continue;//반복은 수행한다
				if(j==1)  continue HERE;
				System.out.printf("< %d , %d >\n", i, j); // 총 실행 횟수 : 6
			}//<---continue는 }앞으로 간다
			//break는 }뒤로
			System.out.println("data");
		}
	}}