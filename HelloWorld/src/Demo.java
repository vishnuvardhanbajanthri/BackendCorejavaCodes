interface Mycal{
	void addition(int i,int j);
}

class Addtest{
	static void add(int a, int b) {
		System.out.println("sum is: "+a+b);
	}
}
public class Demo {
	public static void main(String[] args) {
		Mycal mycal =Addtest::add;
		mycal.addition(12,23);
	
	}
}







//interface MyCalculator (
//
//		void addition (inti, intj).
//
//		class Add Test (
//
//		static void addinta int b)
//
//		System.out.println("Sum is + a + b).
//
//		public class MethodRefDemo [
//
//		public static void main(String[] args) {
//
//		MyCalculator calculator = AddTest:add
//
//		calculator.addition(12, 23),