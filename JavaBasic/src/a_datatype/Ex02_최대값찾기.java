package a_datatype;
public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		int [] score = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int max=score[0];;
		
		for(int i = 1; i<score.length;i++) {
			if(score[i]>max) {
				max= score[i];
			}			
		}
		System.out.println("가장 큰 값은:"+ max);
	
	}

}
