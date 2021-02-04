import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int y = (int) x;
		int notaCem;
		int notaCinq;
		int notaVinte;
		int notaDez;
		int notaCinco;
		int notaDois;
		int moedaUm;
		int moedaCinq;
		int moedaVinteC;
		int moedaDez;
		int moedaCinco;
		int moedaUmCent;
		x -= Double.valueOf(y);
		x = x * 100;
		int z = (int) x;
		notaCem = y / 100;
		y -= notaCem * 100;
		notaCinq = y / 50;
		y -= notaCinq * 50;
		notaVinte = y / 20;
		y -= notaVinte * 20;
		notaDez = y / 10;
		y -= notaDez * 10;
		notaCinco = y / 5;
		y -= notaCinco * 5;
		notaDois = y / 2;
		y -= notaDois * 2;
		moedaUm = y / 1;
		y -= moedaUm * 1;
		moedaCinq = z / 50;
		z -= moedaCinq * 50;
		moedaVinteC = z / 25;
		z -= moedaVinteC * 25;
		moedaDez = z / 10;
		z -= moedaDez * 10;
		moedaCinco = z / 5;
		z -= moedaCinco * 5;
		moedaUmCent = z / 1;
		z -= moedaUmCent * 1;

		System.out.println("NOTAS:");
		System.out.println(notaCem + " nota(s) de R$ 100.00");
		System.out.println(notaCinq + " nota(s) de R$ 50.00");
		System.out.println(notaVinte + " nota(s) de R$ 20.00");
		System.out.println(notaDez + " nota(s) de R$ 10.00");
		System.out.println(notaCinco + " nota(s) de R$ 5.00");
		System.out.println(notaDois + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moedaUm + " moeda(s) de R$ 1.00");
		System.out.println(moedaCinq + " moeda(s) de R$ 0.50");
		System.out.println(moedaVinteC + " moeda(s) de R$ 0.25");
		System.out.println(moedaDez + " moeda(s) de R$ 0.10");
		System.out.println(moedaCinco + " moeda(s) de R$ 0.05");
		System.out.println(moedaUmCent + " moeda(s) de R$ 0.01");
	}

}
