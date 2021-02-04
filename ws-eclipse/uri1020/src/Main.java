import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ano;
		int mes;
		int dia;
		ano = x / 365;
		x-= ano * 365;
		mes = x / 30;
		x-= mes * 30;
		dia = x;
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}

}
