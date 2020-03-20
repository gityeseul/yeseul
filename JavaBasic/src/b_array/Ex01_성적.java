package b_array;

public class Ex01_성적 {

	public static void main(String[] args) {
		//int [] kor;
		//kor = new int[5];
		/*
		 int [] kor = new int[5];

		 kor[0]= 90;
		 kor[1]= 88;
		 kor[2]= 89; // 배열은 자동 초기화
		 kor[3]= 70;
		 kor[4]= 77;
*/
		 //kor[5]= 99;
		 
		 //배열 초기화
		 //int []kor = new int[]{90,88,89,70,77};
		 int []kor = {90,88,89,70,77};
		 
		 int total = 0;
		
		 for (int i=0; i<kor.length; i++){ //일반적으로 이렇게 작성합니다.
			 System.out.print(" "+ kor[i]);
			 total += kor[i];
		 }
		 System.out.println();
		 System.out.println(total);
	}

}
