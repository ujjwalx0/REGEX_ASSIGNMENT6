
/*Create an interface as Calculator with methods like sum, sub, mul and div for 2 numbers.
Create an implementation class as MyCalculator.
Take a class with main() and test them.*/
package Assignments_Regex;
interface Calculator11 {

	default void sum(int a, int b) {
		System.out.println("a+b = "+ (a+b));
		
	}
	default void sub(int a, int b) {

		System.out.println("a-b = " + (a - b));
	}

	default void mul(int a, int b) {
		System.out.println("a*b = " + (a * b));

	}

	default void div(int a, int b) {
		System.out.println("a/b = " + (a / b));
	}
}

class calculator22 implements Calculator11 {

}


public class interfaces_mainn  {

	public static void main(String[] args) {
		calculator22 p = new calculator22();
		p.sum(7, 8);
		p.sub(9, 6);
		p.mul(6, 8);
		p.div(20, 5);
	}

}
