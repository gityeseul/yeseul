package temp;

public class Ex_행렬에번호붙이기 {

	public static void main(String[] args) {

		/*
		for(int i= 1; i<=3; i++) {
			System.out.print(i+ " ");
		}
		 */
		
		//3행 2열 행렬이 있다 가정하고 번호 붙이기
		int n=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				n++;
				System.out.printf("<%d,%d>", i, j); // 총 실행 횟수 : 6
			}
			System.out.println();
		}

	}}
