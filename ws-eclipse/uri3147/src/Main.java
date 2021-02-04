import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int E = sc.nextInt();
		int A = sc.nextInt();
		int O = sc.nextInt();
		int W = sc.nextInt();
		int X = sc.nextInt();
		int bem = H + E + A + X;
		int mau = O + W;
		if (bem >= mau) {
			System.out.println("Middle-earth is safe.");
		}else {
			System.out.println("Sauron has returned.");
		}
	}
}
