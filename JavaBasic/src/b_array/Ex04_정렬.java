package b_array;

public class Ex04_정렬 {

	public static void main(String[] args) {
int [] score = new int[] {4,5,9,1,7};
		
		int max=score[0];;
		int tmp=0;
		int j=0;
		for(int i=score.length-1;i>0;i--) {
			for(j=0; j<i;j++) {
				if(score[j]>score[j+1]) {
					//swapping
					tmp = score[j+1];
					score[j+1]= score[j];
					score[j]=tmp;
					
				}
			}
		}
		for(int a=0;a<score.length;a++) {
			System.out.print(score[a]+"<");
		}
	}

}
