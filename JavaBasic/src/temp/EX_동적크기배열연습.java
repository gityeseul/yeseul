package temp;

public class EX_동적크기배열연습 {

	public static void main(String[] args) {
		int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		int max=0;
		int sum=0;
		int max_idx=0;
		for(int i=0; i<a.length; i++) {
//			a[i]=new int[i+a.length];// i에 따라 동적으로 메모리 만들기
			sum=0;
			for(int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
			
			}
				if(sum>=max) {	
					max=sum;
					max_idx=i; }	
			}
		
		System.out.println(max_idx);	
	}}