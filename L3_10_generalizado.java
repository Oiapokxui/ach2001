import java.util.Scanner;;
class L3_10_generalizado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int andares = scan.nextInt();
		int largura = 1 + 2*(andares - 1);
		int lados = (largura - 1) / 2;
		for (int asterisco = 1; asterisco <= largura; asterisco += 2) {
			for (int i = 1; i<= lados ; i++) System.out.print(".");
			for (int i = 1; i<= asterisco; i++) System.out.print("*");
			for (int i = 1; i<= lados; i++) System.out.print(".");
			lados --;
			System.out.print("\n");
		}
	}
}
