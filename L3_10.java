class L3_10 {
	public static void main(String[] args) {
		int lados = 3;
		int meio = 6;
		for (int asterisco = 1; asterisco <= 7; asterisco += 2) {
			for (int i = 1; i<= lados; i++) System.out.print(".");
			for (int i = 1; i<= asterisco; i++) System.out.print("*");
			for (int i = 1; i<= meio; i++) System.out.print(".");
			for (int i = 1; i<= asterisco; i++) System.out.print("*");
			for (int i = 1; i<= lados; i++) System.out.print(".");
			meio -= 2 ;
			lados --;
			System.out.print("\n");
		}
	}
}
