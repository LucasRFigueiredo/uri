import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int qt = sc.nextInt();
		double total;
		if(cod == 1) {
			total = 4.00 * qt;
			System.out.printf("Total: R$ %.2f\n", total);
		}else if(cod ==2) {
			total = 4.50 *qt;
			System.out.printf("Total: R$ %.2f\n", total);
		}else if(cod ==3) {
			total = 5.00 *qt;
			System.out.printf("Total: R$ %.2f\n", total);
		}else if(cod ==4) {
			total = 2.00 *qt;
			System.out.printf("Total: R$ %.2f\n", total);
		}else if(cod ==5) {
			total = 1.50 *qt;
			System.out.printf("Total: R$ %.2f\n", total);
		}		
	}
}
