import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {			
			StringBuilder Senha = new StringBuilder(readLine(sc));
			for(int j = 0; j<Senha.length();j++) {
				int code = Senha.charAt(j);
				if((code>=65 && code <= 90) ||(code >= 97 && code <= 122)) {
					char c = (char) (code + 3);
					Senha.setCharAt(j,  c);
				}
			}
			Senha.reverse();
			for(int j = Senha.length() / 2; j< Senha.length();j++) {
				char c = (char) (Senha.charAt(j) - 1);
				Senha.setCharAt(j, c);
			}
			System.out.println(Senha.toString());
		}	
	}

	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}
}
