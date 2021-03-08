package ma.sqli.brute.force;

public class Main {

	public static void main(String[] args) {
		
		
		BruteForceApp bruteForce = new BruteForceApp();
		
		
		bruteForce.addUser("Tizi", "123");
		bruteForce.addUser("sqli", "123");

		
		
		System.out.println(bruteForce.login("Tizi", "12"));
		System.out.println(bruteForce.login("Tizi", "12"));
		System.out.println(bruteForce.login("Tizi", "12"));
		System.out.println(bruteForce.login("Tizi", "12"));


		System.out.println(bruteForce.login("sqli", "123"));

		
	}
}
