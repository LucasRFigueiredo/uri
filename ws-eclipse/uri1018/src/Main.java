import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = x;
		int notaCem;
		int notaCinq;
		int notaVinte;
		int notaDez;
		int notaCinco;
		int notaDois;
		int notaUm;
		notaCem = x/100;
		x -= notaCem * 100;
		notaCinq = x/50;
		x -= notaCinq * 50;
		notaVinte = x/20;
		x -= notaVinte * 20;
		notaDez = x/10;
		x -= notaDez * 10;
		notaCinco = x/5;
		x -= notaCinco * 5;
		notaDois = x/2;
		x -= notaDois * 2;
		notaUm = x/1;
		x -= notaUm * 1;		
		System.out.println(y);
		System.out.println(notaCem + " nota(s) de R$ 100,00");
		System.out.println(notaCinq + " nota(s) de R$ 50,00");
		System.out.println(notaVinte + " nota(s) de R$ 20,00");
		System.out.println(notaDez + " nota(s) de R$ 10,00");
		System.out.println(notaCinco + " nota(s) de R$ 5,00");
		System.out.println(notaDois + " nota(s) de R$ 2,00");
		System.out.println(notaUm + " nota(s) de R$ 1,00");
	}

}
