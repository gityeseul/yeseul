package a_datatype;

public class Ex05_lotto_2 {

	public static void main(String[] args) {

		int lotto[][]= new int[5][6];//6개가 5줄[칸][줄]
		int tmp=0;

		for(int i=0; i<lotto.length;i++) {
			for(int j=0; j<lotto[i].length;j++) {
				lotto[i][j]=(int)(Math.random()*45)+1;//1~10까지 숫자를 랜덤으로 만들어주는 함수

				for(int z=0; z<5; z++) {
					for(int k=0; k<j; k++) {
						while(lotto[z][j]==lotto[z][k]) {

							lotto[z][j]=(int)(Math.random()*45)+1;

						}}
					}
				}
			}
		
		for(int i=0; i<lotto.length; i++) { 
			for(int k=lotto[i].length-1; k>0; k--) {
				for(int j=0; j < k; j++) { 
					if(lotto[i][j] > lotto[i][j+1]) {
						// swapping
						tmp = lotto[i][j];
						lotto[i][j] = lotto[i][j+1];
						lotto[i][j+1] =tmp;  
					}
				}
			}
		}
		for(int h=0; h<5; h++) {
			for(int j=0; j<6; j++) {
				System.out.print(lotto[h][j] + "/");
			}
			System.out.println();


		}
	}

}