package a_datatype;

public class Ex05_lotto {

	public static void main(String[] args) {
		//
		int lotto[]= new int[6];
		for(int j=0; j<6;j++) {
			lotto[j]=(int)(Math.random()*45)+1;//1~10까지 숫자를 랜덤으로 만들어주는 함수
			
		}

		int tmp=0;
		int j=0;
		for(int i=lotto.length-1;i>0;i--) {
			for(j=0; j<i;j++) {
		
			if(lotto[j]>lotto[j+1]) {
					//swapping
					tmp = lotto[j+1];
					lotto[j+1]= lotto[j];
					lotto[j]=tmp;
					
				}
			}
		}
		
		
		for(int a=0;a<lotto.length;a++) {
			System.out.print(lotto[a]+"/");
		}
		
		
		
		
		
		
	}

}

	

//13/41/5/1/42/22/
//13/39/15/14/6/39/
//9/8/32/38/37/11/
//9/8/32/38/37/11/
//35/26/21/15/39/30/