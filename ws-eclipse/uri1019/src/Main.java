import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int seg;
		int min;
		int hora;
		seg = (x % 60);
		hora = x / 3600;
		x -= hora * 3600;
		min = x / 60;
		x -= min * 60;

		System.out.println(hora + ":" + min + ":" + seg);
	}

}
