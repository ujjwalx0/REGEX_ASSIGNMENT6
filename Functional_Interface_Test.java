
/*Create a functional interface, and implementation class and test them.  */

@FunctionalInterface
interface Functional_interface{
	public abstract void greet(String name);
}
class Functional_interface_imple implements  Functional_interface {
	public void greet(String name) {
		System.out.println("Good Morning "+name);}
}
 class Functional_Interface_Test{
	public static void main(String[] args) {
		
   Functional_interface Func_intf = new  Functional_interface_imple();
   Func_intf.greet("ujjwal");
	

}
}