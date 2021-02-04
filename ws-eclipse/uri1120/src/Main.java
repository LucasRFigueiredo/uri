import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String contrato;
		while (!(contrato = sc.nextLine()).equals("0 0")) {
			String[] p = contrato.split("\\s");
			String D = p[0];
			String N = p[1];
			String r = N.replace(D, "");
			r = r.replaceFirst("0*", "");
			System.out.println(r.length() > 0 ? r : 0);
		}

	}

}
