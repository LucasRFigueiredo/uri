import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		double exame;
		System.out.println("Media: " + df.format(media));
		if (media >= 7) {			
			System.out.println("Aluno aprovado.");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno em exame.");
			exame = sc.nextDouble();
			media = (exame + media) / 2;
			System.out.println("Nota do exame: " + df.format(exame));
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + df.format(media));
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + df.format(media));
			}
		} else {			
			System.out.println("Aluno reprovado.");
		}
	}
}
