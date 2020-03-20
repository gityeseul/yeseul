package temp;

public class Ex07_동적크기 {
	public static void main(String[] args) {
		
	char[][] star = new char[5][];
	
	for(int i=0; i<5; i++) {
		star[i]=new char[i+1];// i에 따라 동적으로 메모리 만들기
		for(int j=0; j<=i; j++) {
		star[i][j]='*';	
		}
	}	
	for(int i=0; i<star.length; i++) {
		for(int j=0; j<star[i].length; j++) {
		System.out.print(star[i][j]+" ");
		}
		System.out.println();
	}		
}}
