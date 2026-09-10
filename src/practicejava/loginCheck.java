package practicejava;
public class loginCheck {
	public static void main(String[] args) {
		String user="kowshik";
		int pass=1234;
		String password=String.valueOf(pass);
		if(user.equals("kowshik") && password.equals(1234) ) {
			System.out.println("USER IS NOT AN AUTHORIZED PERSON");
		}
		else {
			System.out.println("USER IS  AN AUTHORIZED PERSON");
		}
	}

}
