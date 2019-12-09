public class GanjilGenap{
	public static void main(String[] args){
	 int input = Integer.parseInt(args[0]);
	 String hasil = input %2 == 0 ? "Genap" : "Ganjil";
	 
	 System.out.println(input + " Ini adalah bilangan " +hasil);

	}
}