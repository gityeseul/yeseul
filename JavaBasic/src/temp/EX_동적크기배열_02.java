package temp;

public class EX_동적크기배열_02 {

	public static void main(String[] args) {
		int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
		int max1=0;
		int max2=0;
		int sum=0;
		int max_idx=0;
		int max_idy=0;
		
		for(int i=0; i<a.length; i++) {
//			a[i]=new int[i+a.length];// i에 따라 동적으로 메모리 만들기
			for(int j=0; j<a[i].length; j++) {
				sum+=a[i][j];		
			
				if(sum>=max1) {	
					max1=sum;
					max_idx=i;
					}	
			}}

		System.out.println();

		System.out.print(max_idx);
	}

}
