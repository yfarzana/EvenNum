import java.util.Scanner;
public class LoginApp {
	public static void main(String[] args) {
		String username = "ABC2018";
		String password ="Nova$2018";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Username.");
		String loginuser = input.next();
		System.out.println("Enter your password.");
		String loginpassword = input.next();
		if (username.equals(loginuser) && password.equals(loginpassword))
			System.out.println("Welcome ABC2018");
		else
			System.out.println("Invalid Username or Password");
		
	}
}
		