package module.j2;

public class Pattern2 {
	public static void main(String[] args) {
		int c = 1;
		for(int i = 0;i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}
