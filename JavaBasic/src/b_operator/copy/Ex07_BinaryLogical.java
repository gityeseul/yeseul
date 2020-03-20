package b_operator.copy;
public class Ex07_BinaryLogical {
	public static void main(String[] args) {
		
//이진논리 : &(and) |(or) ^(Xor):두개가 같으면 check (00 11) 
//t/f 할려면 && ||
		int a = 15;
		int b = 10;
		//1248 1111 1010 0101
		System.out.println(a&b);//10 1010
		System.out.println(a|b);//15 1111
		System.out.println(a^b);//5  0101
	}
}
