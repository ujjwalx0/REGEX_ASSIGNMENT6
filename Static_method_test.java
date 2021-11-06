/*Create an interface as Calc with static methods like sum, sub, mul and div for 2 numbers.
Take a class with main() and test it.
 */

interface Static_Methods_Interfaces {
	static void sum(int a , int b) {
		System.out.println("a+b = "+""+(a+b));
		
	}
	static void sub(int a , int b) {
		System.out.println("a-b = "+(a-b));
	}
	static void mul(int a , int b) {
		System.out.println("a*b = "+(a*b));
	}
	static void div(int a , int b) {
		System.out.println("a/b = "+(a/b));
	}
}
public class Static_method_test {

	public static void main(String[] args) {
		 Static_Methods_Interfaces.sum(5,8);
		 Static_Methods_Interfaces.sub(12,8);
		 Static_Methods_Interfaces.mul(5,8);
		 Static_Methods_Interfaces.div(40,8);

	}

}
