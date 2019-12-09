public class Ternary{
	public static void main(String[] args){
		boolean hujan = true;
		
		System.out.println(hujan ? "Bawa Payung" : "tidak bawa payung");
		
		String nama = "Aryo";
		String access = nama == "Aryo" ? "Selamat datang Admin" : "Anda bukan Admin";
		System.out.println(access);
		String password = "secret";
		boolean loggedin = password == "scret" ? true : false;
		System.out.println(loggedin);
	}
}