package b_operator.copy;
/**
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  
 *  [예] 0000 0010	<<1 		0000 0100
 *  	  0000 0010	>>1		0000 0001
 */
public class Ex04_Shift {
	public static void main(String[] args) {

		int su = -4;
		System.out.println(su);
		System.out.println(su << 4); // -64
		System.out.println(su >> 4); // 0100
		
		System.out.println(su >>> 1); //부호비트에 0으로 채우는 연산자
	}

}
