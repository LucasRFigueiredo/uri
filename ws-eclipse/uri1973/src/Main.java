import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int qt[] = new int[n];
		int atacados[] = new int[n];
		int roubados = 0;
		int total = 0;
		for(int i=0;i<n;i++) {
			qt[i] = sc.nextInt();
			total+= qt[i];
		}
		for(int i=0;i<n;i++) {
			if(qt[i]%2 != 0) {
				if(qt[i] == 0) {
					break;
				}else {
					qt[i]-=1;
					roubados++;
				}
			}else if(qt[i]%2 ==0){
				if(qt[i] == 0) {
					break;
				}else {
					qt[i]-=1;
					roubados++;
					i--;
				}
			}
		}
		total-=roubados;
		System.out.println(roubados + " " + total);
	}

}
//incompleto
