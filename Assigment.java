public class Assigment{ //penugasan
	public static void main(String[] args){
		int a = 10;
		int b = 5;
		
		
		System.out.println(a); //10
		System.out.println();
		a = b;
		System.out.println(a); //5
		a += b;
		System.out.println(a); // a = 10
		b -= a;
		System.out.println(b); //b = -5
		b *= b; // -5*-5
		System.out.println(b); // b = 25
		b /= a;
		System.out.println(b); // b = 2
		a %= b;
		System.out.println(a); //a = 0
	
	}
}