package temp;

public class Ex_369 {

	public static void main(String[] args) {
		int n8=0;
		for(int i=1; i<=10000; i++) {
			int su = i;
			 //if문 안에 값이 들어 있는지 아닌지 확인할 때 사용
			while(su!=0) {
				int na = su%10;				
				if(na==8) {										
					n8++;
				}
				su/=10;//				
			}//su369값을 출력
		}	
			System.out.println(n8);		
	}}

